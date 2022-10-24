package com.tiago.todo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.todo.domain.Todo;
import com.tiago.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {
		/* Formata o padrão de DATA, Dia/Mes/Ano e Hora e Minuto */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				LocalDateTime.parse("25/12/2022 10:40", formatter), false);
		todoRepository.saveAll(Arrays.asList(t1));
	}
}
