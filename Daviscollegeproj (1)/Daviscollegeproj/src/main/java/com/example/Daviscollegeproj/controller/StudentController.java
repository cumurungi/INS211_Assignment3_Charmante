package com.example.Daviscollegeproj.controller;
import com.example.Daviscollegeproj.entity.Students;
import com.example.Daviscollegeproj.repository.CourseRepository;
import com.example.Daviscollegeproj.repository.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentsRepository repository;
    @Autowired
    CourseRepository courseRepository;
    @GetMapping("/students")
    public String showProduct(Model model){
        model.addAttribute("studentsList",repository.findAll());
        return "liststudents";
    }

    @PostMapping("/addstudent")
    public String addProduct(Students students){
        repository.save(students);
        return "redirect:/students";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id){
        repository.deleteById(id);
        return"redirect:/students";
    }
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") Integer id, Model model){
        model.addAttribute("students", repository.findById(id).get());
        model.addAttribute("courseList",courseRepository.findAll());
        return"editstudent";
    }
}
