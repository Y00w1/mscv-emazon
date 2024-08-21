package com.example.msvc_stock.application.dto.mapper;

import com.example.msvc_stock.application.dto.category.CategoryDto;
import com.example.msvc_stock.application.dto.category.CreateCategoryDto;
import com.example.msvc_stock.domain.models.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toDomain(CreateCategoryDto createCategoryDto);
    CategoryDto toDto(Category category);
}
