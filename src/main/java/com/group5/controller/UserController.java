package com.group5.controller;
import com.group5.service.implementations.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    UserServiceImpl userService;

    public UserController(UserServiceImpl userService)
    {
        this.userService=userService;
    }
}
