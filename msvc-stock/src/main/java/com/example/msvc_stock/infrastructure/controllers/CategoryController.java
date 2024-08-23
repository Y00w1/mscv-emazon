package com.example.msvc_stock.infrastructure.controllers;

import com.example.msvc_stock.application.dto.category.CategoryDto;
import com.example.msvc_stock.application.dto.category.CreateCategoryDto;
import com.example.msvc_stock.application.services.CategoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller to handle operations related to categories.
 *  * Maps HTTP requests to appropriate service methods.
 */
@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    /**
     * Endpoint to create a new category.
     *
     * @param createCategoryDto Object containing the data for the category to be created.
     * @return ResponseEntity with the DTO of the created category and an HTTP status code 201 (CREATED).
     */
    @PostMapping("/create")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CreateCategoryDto createCategoryDto) {
        return new ResponseEntity<>(categoryService.createCategory(createCategoryDto), HttpStatus.CREATED);
    }
}
