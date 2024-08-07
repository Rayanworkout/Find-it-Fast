package com.github.rayanworkout.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to Indexium. Start by creating a schema and index your first documents.";
	}

}
