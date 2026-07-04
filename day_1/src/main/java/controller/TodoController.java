package controller;

import entity.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // Get all todos
    @GetMapping
    public List<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    // Create todo
    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todo) {
        return todoService.saveTodo(todo);
    }

    // Get todo by ID
    @GetMapping("/{id}")
    public TodoEntity getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    // Delete todo
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
