package com.tiago.todo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.todo.domain.Todo;
import com.tiago.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
		/* Formata o padrão de DATA, Dia/Mes/Ano e Hora e Minuto */
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				sdf.parse("25/12/2022"), false);
		
		Todo t2 = new Todo(null, "Ler", "Ler Livro JAVA e Angular",
				sdf.parse("01/01/2023"), true);
		
		Todo t3 = new Todo(null, "Criar API", "SpringBoot e Angular",
				sdf.parse("28/02/2024"), false);
		
		Todo t4 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				sdf.parse("01/05/2023"), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
