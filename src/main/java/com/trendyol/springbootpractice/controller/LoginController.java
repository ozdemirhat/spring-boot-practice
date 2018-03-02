package com.trendyol.springbootpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@ResponseBody
    public String showLoginMessage(ModelMap model){
        //model.put("name", name);
        //System.out.println(name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //@ResponseBody
    public String loginMessage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        //System.out.println(name);
        return "welcome";
    }

}
