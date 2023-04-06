package com.cloudrural.basiclogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BasicLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicLoginApplication.class, args);
		DBConnector db = new DBConnector();

		db.ordersList();
	}

}


