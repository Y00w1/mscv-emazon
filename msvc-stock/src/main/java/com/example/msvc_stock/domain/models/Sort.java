package com.example.msvc_stock.domain.models;

public class Sort {
    private String field;
    private String direction;

    public Sort(String field, String direction) {
        this.field = field;
        this.direction = direction;
    }

    public String getField() {
        return field;
    }

    public String getDirection() {
        return direction;
    }
}
