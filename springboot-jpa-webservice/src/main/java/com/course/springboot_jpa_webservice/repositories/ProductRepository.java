package com.course.springboot_jpa_webservice.repositories;

import com.course.springboot_jpa_webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
