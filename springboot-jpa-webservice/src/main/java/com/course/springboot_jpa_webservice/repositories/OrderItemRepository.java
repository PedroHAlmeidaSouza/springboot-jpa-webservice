package com.course.springboot_jpa_webservice.repositories;

import com.course.springboot_jpa_webservice.entities.OrderItem;
import com.course.springboot_jpa_webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
