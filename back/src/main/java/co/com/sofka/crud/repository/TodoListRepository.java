package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.TodoList;
import org.springframework.data.repository.CrudRepository;

public interface TodoListRepository extends CrudRepository<TodoList, Long> {
}
