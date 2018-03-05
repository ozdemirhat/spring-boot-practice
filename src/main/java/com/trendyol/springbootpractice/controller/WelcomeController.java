package com.trendyol.springbootpractice.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    //@ResponseBody
    public String showWelcomePage (ModelMap model){
        model.put("name",getLoggedinUsername());
        return "welcome";
    }

    private String getLoggedinUsername(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails){
            return ((UserDetails)principal).getUsername();
        }

        return principal.toString();
    }

}
