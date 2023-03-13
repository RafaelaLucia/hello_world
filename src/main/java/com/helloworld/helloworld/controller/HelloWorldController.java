package com.helloworld.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endpoint")
public class HelloWorldController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsms")
	public List<String> BSMs() {
		List<String> bsm = Arrays.asList("Mentalidade de Crescimento","Persistência","Responsabilidade Pessoal","Orientação ao Futuro","Comunicação","Proatividade","Orientação ao Detalhe","Trabalho em Equipe");
	    return bsm;
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivos() {
		List<String> aprendizagem = Arrays.asList("Aprender o framework Spring","Aprender conectar Database com API");
	    return aprendizagem;
	}

}
