package com.example.msvc_stock.domain.ports.out;

import com.example.msvc_stock.domain.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryPort {
    Category save(Category category);
    Optional<Category> findById(Long id);
    Optional<Category> findByName(String name);
    List<Category> findAll();
    Optional<Category> update(Category category);
    boolean deleteById(Long id);
}
