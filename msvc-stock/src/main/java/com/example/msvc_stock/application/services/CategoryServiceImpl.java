package com.example.msvc_stock.application.services;

import com.example.msvc_stock.application.dto.category.CategoryDto;
import com.example.msvc_stock.application.dto.category.CreateCategoryDto;
import com.example.msvc_stock.application.dto.mapper.CategoryMapper;
import com.example.msvc_stock.domain.ports.in.CreateCategoryUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CreateCategoryUseCase createCategoryUseCase;
    private final CategoryMapper mapper;

    @Override
    public CategoryDto createCategory(CreateCategoryDto createCategoryDto) {
        return mapper.toDto(createCategoryUseCase.createCategory(mapper.toDomain(createCategoryDto)));
    }
}
