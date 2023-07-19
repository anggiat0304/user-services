package com.service.userservices.controller;

import com.service.userservices.model.UserModel;
import com.service.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerAccount(@RequestBody UserModel request){

    }
}
