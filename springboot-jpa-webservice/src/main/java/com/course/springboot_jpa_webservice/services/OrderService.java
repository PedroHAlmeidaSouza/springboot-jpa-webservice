package com.course.springboot_jpa_webservice.services;

import com.course.springboot_jpa_webservice.entities.Order;
import com.course.springboot_jpa_webservice.entities.User;
import com.course.springboot_jpa_webservice.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
