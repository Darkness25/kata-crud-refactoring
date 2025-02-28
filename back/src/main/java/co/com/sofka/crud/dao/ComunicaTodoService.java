package co.com.sofka.crud.dao;

import co.com.sofka.crud.entity.Todo;

public interface ComunicaTodoService {

    Iterable<Todo> list();
    Todo save(Todo todo);
    void delete(Long id);
    Todo get(Long id);

}
