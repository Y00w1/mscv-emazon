package com.example.msvc_stock.application.dto.mapper;

import com.example.msvc_stock.application.dto.pagination.SortDto;
import com.example.msvc_stock.domain.models.Sort;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SortMapper {
    Sort toDomain(SortDto sortDto);
}
