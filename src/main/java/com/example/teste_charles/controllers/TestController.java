package com.example.teste_charles.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestController {
	
	public Logger logger = Logger.getLogger(TestController.class.getName());
	
	@GetMapping("/boasvindas")
	public String boasVindas() {	
		logger.info("Inicio do get");
		String msg = "Olá Mundo sou da terra";
		logger.info("Fim do get");
		return msg;
	}
	
	@PostMapping
	public String novaMensagem(@RequestBody String msg) {		
		logger.info("Inicio do post");
		String novaMsg = msg;
		logger.info("fim do post");
		return novaMsg;
	}

}
