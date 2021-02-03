package com.deepak.kumbhar.userservice.controller;

import com.deepak.kumbhar.userservice.VO.ResponseTemplate;
import com.deepak.kumbhar.userservice.entity.User;
import com.deepak.kumbhar.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("In saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getDepartment(@PathVariable("id") Long userId){
        log.info("In getUser of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
