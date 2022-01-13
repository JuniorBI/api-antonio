package com.example.antonio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //fornecer os endpoints e receber as requisições /clientes
@RequestMapping ("/clientes")
public class ClienteController {
	
	@GetMapping
	public String TesteAPI () {
		return "Teste OK";
	}

}
