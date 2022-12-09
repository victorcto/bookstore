package com.bookstore.store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.store.repositories.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    
}
