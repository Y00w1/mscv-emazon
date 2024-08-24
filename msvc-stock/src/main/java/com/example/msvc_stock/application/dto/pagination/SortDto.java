package com.example.msvc_stock.application.dto.pagination;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SortDto(
        @NotBlank(message = "Sort field cannot be empty") String field,
        @Pattern(regexp = "asc|desc", message = "Sort direction must be either 'asc' or 'desc'") String direction
) {
    public SortDto() {
        this("name", "asc"); // Default sort by 'name' in ascending order
    }
}
