package com.tiago.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tiago.todo.service.DBService;

@Configuration
@Profile("test") /*quando o perfil test estiver ATIVO a classe é iniciada*/
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instanciaBD() throws ParseException {
		this.dbService.instanciaBaseDeDados();
		return true;
	}
}
