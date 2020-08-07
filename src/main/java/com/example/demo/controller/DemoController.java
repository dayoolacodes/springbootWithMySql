package com.example.demo.controller;

import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@RequestMapping("/url")
public class DemoController {

    @Autowired
    UserRepository userRepo;

//    @GetMapping("/dayo")
//    public String helloWorld(){
//        return "Dayo Welcome to Spring World";
//    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }

}
