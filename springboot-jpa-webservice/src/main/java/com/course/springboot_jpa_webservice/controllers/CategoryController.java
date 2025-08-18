package com.course.springboot_jpa_webservice.controllers;

import com.course.springboot_jpa_webservice.entities.Category;
import com.course.springboot_jpa_webservice.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {

        List<Category> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{categoryId}")
    public ResponseEntity<Category> findById(@PathVariable Long categoryId) {

        Category obj = categoryService.findById(categoryId);
        return ResponseEntity.ok().body(obj);
    }
}
