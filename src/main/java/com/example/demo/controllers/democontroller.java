package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class democontroller {
    @RequestMapping(value = "/home")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("home");
        return modelAndView;
    }
}
