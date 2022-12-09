package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {
    
}
