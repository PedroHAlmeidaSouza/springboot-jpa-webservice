package com.course.springboot_jpa_webservice.controllers;

import com.course.springboot_jpa_webservice.entities.User;
import com.course.springboot_jpa_webservice.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<User> findById(@PathVariable Long userId) {

        User obj = userService.findById(userId);
        return ResponseEntity.ok().body(obj);
    }
}
