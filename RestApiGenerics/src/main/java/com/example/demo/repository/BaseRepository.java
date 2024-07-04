package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<T> extends CrudRepository<T, Integer>  {
}
