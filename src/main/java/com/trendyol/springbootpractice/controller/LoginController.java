package com.trendyol.springbootpractice.controller;

import com.trendyol.springbootpractice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@ResponseBody
    public String showLoginPage (ModelMap model){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //@ResponseBody
    public String showErlcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        boolean isValidUser = loginService.validateUser(name, password);
        if (!isValidUser){
            model.put("message", "invalid credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        //System.out.println(name);
        return "welcome";
    }

}
