package com.example.msvc_stock.infrastructure.jpa.repository;

import com.example.msvc_stock.domain.models.Category;
import com.example.msvc_stock.domain.ports.out.CategoryRepositoryPort;
import com.example.msvc_stock.infrastructure.jpa.mapper.CategoryEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class JpaCategoryRepositoryAdapter implements CategoryRepositoryPort {
    private final CategoryEntityMapper entityMapper;
    private final JpaCategoryRepository jpaCategoryRepository;

    @Override
    public Category save(Category category) {
        return entityMapper.toModel(jpaCategoryRepository.save(entityMapper.toEntity(category)));
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Category> findByName(String name) {
        return jpaCategoryRepository.findByName(name).map(entityMapper::toModel);
    }

    @Override
    public List<Category> findAll() {
        return List.of();
    }

    @Override
    public Optional<Category> update(Category category) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
