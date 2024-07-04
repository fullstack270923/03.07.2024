package com.example.demo.controllers;

import com.example.demo.model.Book;
import com.example.demo.model.Book2;
import com.example.demo.repository.Book2Repository;
import com.example.demo.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books/new")
public class NewBookController extends BaseController<Book> {

    // 2. Autowired
    //    @Autowired
    //    private BookRepository bookRepository;

    // 1. ctor gets the repo
    //private Book2Repository bookRepository;



}
