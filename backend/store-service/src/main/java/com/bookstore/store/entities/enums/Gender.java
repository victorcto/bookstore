package com.bookstore.store.entities.enums;

public enum Gender {
    M(1, "male"),
    F(2, "female");

    private int code;
    private String description;

    private Gender(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    
}
