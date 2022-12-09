package com.bookstore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.store.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
