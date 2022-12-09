package com.bookstore.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.store.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
}
