package repository;

import entity.todoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface todoRepository extends JpaRepository<todoEntity, Long> {

}