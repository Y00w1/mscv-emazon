package com.example.msvc_stock.domain.ports.in.category;

import com.example.msvc_stock.domain.models.Category;


public interface CreateCategoryUseCase {
    Category createCategory(Category category);
}
