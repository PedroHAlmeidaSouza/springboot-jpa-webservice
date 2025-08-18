package com.course.springboot_jpa_webservice.repositories;

import com.course.springboot_jpa_webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
