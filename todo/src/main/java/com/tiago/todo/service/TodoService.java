package com.tiago.todo.service;

import java.util.Optional;

import org.apache.tomcat.util.digester.ObjectCreationFactory;
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
	
}
