package com.course.springboot_jpa_webservice.repositories;

import com.course.springboot_jpa_webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
