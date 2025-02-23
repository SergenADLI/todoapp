package com.hotsoup.application.interfaces;


import com.hotsoup.domain.entities.Todo;

import java.util.List;

public interface ITodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);
}
