package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
    
}
