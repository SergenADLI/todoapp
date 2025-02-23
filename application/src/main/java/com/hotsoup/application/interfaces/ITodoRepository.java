package com.hotsoup.application.interfaces;

import com.hotsoup.domain.entities.Todo;
import java.util.List;
import java.util.Optional;

public interface ITodoRepository {
    List<Todo> findAll();
    Optional<Todo> findById(Long id);
    Todo save(Todo todo);
    void deleteById(Long id);
}