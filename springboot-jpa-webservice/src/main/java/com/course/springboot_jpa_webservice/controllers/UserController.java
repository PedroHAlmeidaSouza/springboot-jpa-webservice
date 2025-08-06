package com.course.springboot_jpa_webservice.controllers;

import com.course.springboot_jpa_webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotação que define que uma classe responde requisições HTTP com dados (JSON)
@RestController
// Mapeia URLs HTTP para métodos ou classes controladoras no Spring.
@RequestMapping("/users")
public class UserController {

    @GetMapping
    // ResponseEntity é um tipo especifíco do Spring para retornar respostas de requisições WEB
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok(user);
    }
}
