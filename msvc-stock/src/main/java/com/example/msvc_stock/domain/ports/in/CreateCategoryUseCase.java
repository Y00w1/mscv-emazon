package com.example.msvc_stock.domain.ports.in;

import com.example.msvc_stock.domain.models.Category;
import com.example.msvc_stock.domain.models.Paged;
import com.example.msvc_stock.domain.models.Pagination;
import com.example.msvc_stock.domain.models.Sort;


public interface CreateCategoryUseCase {
    Category createCategory(Category category);
    Paged<Category> getCategories(Pagination pagination, Sort sort);
}
