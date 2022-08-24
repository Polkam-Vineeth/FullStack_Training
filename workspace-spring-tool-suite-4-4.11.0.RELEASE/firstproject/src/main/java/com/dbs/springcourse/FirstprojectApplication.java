package com.dbs.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstprojectApplication.class, args);
		
		DBSProcess dbsPro = context.getBean(DBSProcess.class);
		dbsPro.display();
		dbsPro.event();
	}

}
