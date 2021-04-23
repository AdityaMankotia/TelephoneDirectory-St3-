package com.example.TelephoneDirectory.St3.controller;

import com.example.TelephoneDirectory.St3.entity.User;
import com.example.TelephoneDirectory.St3.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private UserService userService;

    @Autowired
    private UserController userController;


    @RequestMapping(value = "/checkuser",method = RequestMethod.POST)
    public String usercheck(@RequestBody String data) throws JsonProcessingException {
        System.out.println(data);
        User user = new ObjectMapper().readValue(data, User.class);
        System.out.println(user.toString());
        if(userService.checkuser(user)) {
            System.out.println("Userfound");
            return "";
        }
        else
        {

            return "false";
        }


    }
}
