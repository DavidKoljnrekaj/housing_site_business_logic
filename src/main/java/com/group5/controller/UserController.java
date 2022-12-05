package com.group5.controller;
import com.group5.model.User;
import com.group5.service.implementations.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    UserServiceImpl userService;

    public UserController(UserServiceImpl userService)
    {
        this.userService=userService;
    }

    @GetMapping(value="/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id){
        try {
            Optional<User> user = Optional.ofNullable(userService.getUserById(id));
            return user.map(value -> new ResponseEntity<Object>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.OK));
        } catch (Exception ex) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/createUser")
    public Optional<User> createUser(@RequestParam(value = "email", defaultValue = "Null") String email,
                                     @RequestParam(value = "name", defaultValue = "Null") String name,
                                     @RequestParam(value = "surname", defaultValue = "Null") String surname,
                                     @RequestParam(value = "password", defaultValue = "Null") String password){
        Optional<User> user = userService.createUser(email, name, surname, password);
        return user;
    }
}