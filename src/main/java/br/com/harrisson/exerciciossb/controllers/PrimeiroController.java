package br.com.harrisson.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = "/ola")
	public String Ola() {
		return "Olá Spring Boot!";
	}

}
