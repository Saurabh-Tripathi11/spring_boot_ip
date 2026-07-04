package repository;

import entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}