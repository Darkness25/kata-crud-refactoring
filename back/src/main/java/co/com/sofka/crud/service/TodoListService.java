package co.com.sofka.crud.service;

import co.com.sofka.crud.entity.TodoList;
import co.com.sofka.crud.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListService {

    @Autowired
    private TodoListRepository repositoryMayor;

    public Iterable<TodoList> list(){
        return repositoryMayor.findAll();
    }

    public TodoList save(TodoList mayorList){
        return repositoryMayor.save(mayorList);
    }

    public void delete(Long id){
        repositoryMayor.delete(get(id));
    }

    public TodoList get(Long id){
        return repositoryMayor.findById(id).orElseThrow();
    }


}
