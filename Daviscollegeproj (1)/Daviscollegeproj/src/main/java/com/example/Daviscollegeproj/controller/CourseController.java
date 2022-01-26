package com.example.Daviscollegeproj.controller;
import com.example.Daviscollegeproj.entity.Courses;
import com.example.Daviscollegeproj.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.*;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository repository;
    @GetMapping("/colist")
    public String viewCategories(Model model){
        model.addAttribute("courseList",repository.findAll());
        return "colist";
    }
    @PostMapping("/coadd")
    public String addCat(Courses courses, Model model){
        model.addAttribute("courses",new Courses());
        repository.save(courses);
        return "redirect:/colist";

    }
}
