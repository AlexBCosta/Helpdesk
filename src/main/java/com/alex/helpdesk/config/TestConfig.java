package com.alex.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alex.helpdesk.services.DBServices;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired //kkk
	private DBServices dbServices;

	@Bean
	public void instanciaDB() {
		this.dbServices.instanciaDB();
	}
}
