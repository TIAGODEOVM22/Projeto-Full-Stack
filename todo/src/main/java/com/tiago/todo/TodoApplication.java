package com.tiago.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;

import com.tiago.todo.domain.Todo;
import com.tiago.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	/*sempre que o APP for reiniciado esse método cria um OBJ e salva*/
	public void run(String... args) throws Exception {
		
		/*Formata o padrão de DATA, Dia/Mes/Ano e Hora e Minuto*/
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot e Angular",
				LocalDateTime.parse("25/12/2022 10:40", formatter), false);
		todoRepository.saveAll(Arrays.asList(t1));
	}

}
