package br.com.harrisson.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.harrisson.exerciciossb.models.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Harrisson", "123456789-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorID(@PathVariable int id) {
		return new Cliente(id, "Maria", "987654321-00");
	}

	@GetMapping
	public Cliente obterClientePorID2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "José", "556684321-00");
	}


}
