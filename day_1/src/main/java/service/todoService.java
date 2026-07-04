package service;

import entity.todoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.todoRepository;

import java.util.List;

@Service
public class todoService {
    @Autowired
    private todoRepository todoRepository;

    // Get all todos
    public List<todoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    // Save a new todo
    public todoEntity saveTodo(todoEntity todo) {
        return todoRepository.save(todo);
    }

    // Get todo by id
    public todoEntity getTodoById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    // Delete todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
