package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
