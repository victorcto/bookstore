package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
