package com.trendyol.springbootpractice.service;

import com.trendyol.springbootpractice.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUser(String user);
}
