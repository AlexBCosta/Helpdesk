package com.alex.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alex.helpdesk.services.DBServices;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBServices dbServices;
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;

	@Bean
	public boolean instanciaDB() {

		if (value.equals("create")) {
			this.dbServices.instanciaDB();
		}
		return false;
	}

}
