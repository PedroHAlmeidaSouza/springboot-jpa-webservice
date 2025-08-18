package com.course.springboot_jpa_webservice.controllers;

import com.course.springboot_jpa_webservice.entities.Order;
import com.course.springboot_jpa_webservice.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {

        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{orderId}")
    public ResponseEntity<Order> findById(@PathVariable Long orderId) {

        Order obj = orderService.findById(orderId);
        return ResponseEntity.ok().body(obj);
    }
}
