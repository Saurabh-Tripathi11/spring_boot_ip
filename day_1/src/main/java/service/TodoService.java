package service;

import entity.TodoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    // Get all todos
    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    // Save a new todo
    public TodoEntity saveTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    // Get todo by id
    public TodoEntity getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    // Delete todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
