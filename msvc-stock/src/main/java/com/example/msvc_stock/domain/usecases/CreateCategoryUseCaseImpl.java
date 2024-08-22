package com.example.msvc_stock.domain.usecases;

import com.example.msvc_stock.domain.exceptions.CategoryAlreadyExistsException;
import com.example.msvc_stock.domain.exceptions.CategoryDescriptionIsRequiredException;
import com.example.msvc_stock.domain.exceptions.CategoryDescriptionTooLongException;
import com.example.msvc_stock.domain.exceptions.CategoryNameTooLongException;
import com.example.msvc_stock.domain.models.Category;
import com.example.msvc_stock.domain.ports.in.CreateCategoryUseCase;
import com.example.msvc_stock.domain.ports.out.CategoryRepositoryPort;

public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase {
    private final CategoryRepositoryPort categoryRepositoryPort;

    public CreateCategoryUseCaseImpl(CategoryRepositoryPort categoryRepositoryPort) {
        this.categoryRepositoryPort = categoryRepositoryPort;
    }

    @Override
    public Category createCategory(Category category) {
        validateCategory(category);
        return categoryRepositoryPort.save(category);
    }

    private void validateCategory(Category category) {
        categoryRepositoryPort.findByName(category.getName()).ifPresent(c -> {
            throw new CategoryAlreadyExistsException("Category already exists");
        });
        if (category.getDescription() == null || category.getDescription().isEmpty()) {
            throw  new CategoryDescriptionIsRequiredException("Category description is required");
        }
        if (category.getName().length() > 50) {
            throw new CategoryNameTooLongException("Category name cannot be longer than 50 characters");
        }
        if (category.getDescription().length() > 90) {
            throw new CategoryDescriptionTooLongException("Category description cannot be longer than 90 characters");
        }
    }
}
