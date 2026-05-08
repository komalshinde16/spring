package com.example.SPRINGPRACTICE.spring_core_008_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greeting() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("greeting");
        List<String> list = List.of( "Aarya", "Komal", "Prerana", "Shital", "Smruti");

        mav.addObject("data", list);
        return mav;
    }
}
