package com.example.TelephoneDirectory.St3.controller;

import com.example.TelephoneDirectory.St3.entity.User;
import com.example.TelephoneDirectory.St3.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("/")
    public String home(){

        return "index";
    }

    @RequestMapping("/Login")
    public String login(){

        return "/html/Login";
    }

    @RequestMapping("/signup")
    public String signup(){

        return "/html/signup";
    }

    @RequestMapping("/dashboard")
    public String usercheck(@RequestBody String data) throws JsonProcessingException {
        System.out.println(data);
        User user = new ObjectMapper().readValue(data, User.class);
        System.out.println(user.toString());
        if(userService.checkuser(user)) {
            System.out.println("Userfound");
            return "/html/Dashboard";
        }
        else
        {
            return "/html/Login";
        }


    }
}
