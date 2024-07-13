package com.digi.controller;

import com.digi.dto.UserRequest;
import com.digi.model.User;
import com.digi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;


    @GetMapping( "/{userId}")
    public User getById(@PathVariable int userId){
        return userService.getById(userId);
    }
    @GetMapping("/filter")
    public List<User> getByName(@RequestParam String name,@RequestParam String surname){
        return userService.getByName(name,surname);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  User createUser(@RequestBody UserRequest userRequest){
        return userService.save(userRequest);
    }

}
