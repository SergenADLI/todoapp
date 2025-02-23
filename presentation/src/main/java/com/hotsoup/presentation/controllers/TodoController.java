package com.hotsoup.presentation.controllers;

import com.hotsoup.application.interfaces.ITodoService;
import com.hotsoup.domain.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private ITodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable long id) {
        return todoService.getTodoById(id);
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable long id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        System.out.println("Delete request for ID: " + id);
        try {
            todoService.deleteTodo(id);
            System.out.println("Successfully deleted ID: " + id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            System.err.println("Error while deleting ID: " + id + " - " + e.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}