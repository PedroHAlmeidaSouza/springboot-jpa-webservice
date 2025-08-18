package com.course.springboot_jpa_webservice.repositories;

import com.course.springboot_jpa_webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
