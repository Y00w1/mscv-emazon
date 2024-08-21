package com.example.msvc_stock.application.services;

import com.example.msvc_stock.application.dto.category.CategoryDto;
import com.example.msvc_stock.application.dto.category.CreateCategoryDto;

public interface CategoryService {
    CategoryDto createCategory(CreateCategoryDto createCategoryDto);
}
