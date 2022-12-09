package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
