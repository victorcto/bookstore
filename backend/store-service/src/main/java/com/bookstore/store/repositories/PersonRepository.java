package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
