package com.tiago.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.todo.domain.Todo;
import com.tiago.todo.repositories.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;

	public Todo findById (Long id) {
		Optional <Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Todo> findAllOpen(){
		List<Todo> list = repository.findAllOpen();
		return list;
	}
	
	public List<Todo> finAllClose(){
		List<Todo> list = repository.findAllClose();
		return list;
	}
	
	public List<Todo> findAll(){
		List <Todo> list = repository.findAll();
		return list;
	}

	public Todo create(Todo obj) {
		obj.setId(null);/*medida de segurança para o usuario não informar o ID*/
		return repository.save(obj);
	}
	
	
}
