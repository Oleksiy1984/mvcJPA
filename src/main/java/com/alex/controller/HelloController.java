package com.alex.controller;

import com.alex.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    AccountRepository repository;


    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(Model model) {

        model.addAttribute("page", repository.findAll());
        return "hello";

    }

}