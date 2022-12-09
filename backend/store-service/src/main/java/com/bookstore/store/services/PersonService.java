package com.bookstore.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.store.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    
}
