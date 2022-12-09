package com.bookstore.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.store.repositories.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;
    
}
