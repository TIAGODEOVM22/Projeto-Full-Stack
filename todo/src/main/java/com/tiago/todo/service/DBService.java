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
		
		Todo t2 = new Todo(null, "Ler", "Ler Livro JAVA e Angular",
				LocalDateTime.parse("01/01/2023 10:50", formatter), true);
		
		Todo t3 = new Todo(null, "Criar API", "SpringBoot e Angular",
				LocalDateTime.parse("28/02/2024 10:40", formatter), false);
		
		Todo t4 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				LocalDateTime.parse("01/05/2023 10:40", formatter), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
