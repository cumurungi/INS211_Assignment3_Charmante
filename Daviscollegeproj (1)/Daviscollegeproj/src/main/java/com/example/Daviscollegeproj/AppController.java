package com.example.Daviscollegeproj;

import com.example.Daviscollegeproj.entity.Students;
import com.example.Daviscollegeproj.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("product", new Students());
        model.addAttribute("coList", courseRepository.findAll());
        return "index";
    }
}
