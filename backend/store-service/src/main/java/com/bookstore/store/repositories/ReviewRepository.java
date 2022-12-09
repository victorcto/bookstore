package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}
