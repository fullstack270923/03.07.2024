package com.example.demo.controllers;

import com.example.demo.model.Book;
import com.example.demo.repository.Book2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class BaseController<T>  {

    // 1. ctor gets the repo
    @Autowired
    private CrudRepository<T, Integer> repository;

    @GetMapping
    public Iterable<T> getAll() {
        return repository.findAll();
    }
}
