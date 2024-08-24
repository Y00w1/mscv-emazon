package com.example.msvc_stock.domain.ports.in;

import com.example.msvc_stock.domain.models.Category;

import java.util.List;

public interface GetCategoriesUseCase {
    List<Category> getCategories();
}
