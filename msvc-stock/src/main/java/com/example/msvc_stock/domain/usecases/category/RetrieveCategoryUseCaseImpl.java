package com.example.msvc_stock.domain.usecases.category;

import com.example.msvc_stock.domain.models.Category;
import com.example.msvc_stock.domain.ports.in.category.RetrieveCategoryUseCase;
import com.example.msvc_stock.domain.ports.out.category.CategoryRepositoryPort;

import java.util.Optional;

public class RetrieveCategoryUseCaseImpl implements RetrieveCategoryUseCase {
    private final CategoryRepositoryPort categoryRepositoryPort;

    public RetrieveCategoryUseCaseImpl(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Optional<Category> retrieveCategory(Long id) {
        return categoryRepositoryPort.findById(id);
    }
}
