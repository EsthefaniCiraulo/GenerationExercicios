package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String HelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/ListaBsm")
	public List<String> ListaBsm() {
		List<String> bsm = new ArrayList<>();
		bsm.add("Introdução às Habilidades Comportamentais e Mentalidades");
		bsm.add("Mentalidade de Crescimento");
		bsm.add("Persistência");
		bsm.add("Responsabilidade Pessoal");
		bsm.add("Orientação ao Futuro");
		bsm.add("Comunicação");
		bsm.add("Orientação ao Detalhe");
		bsm.add("Proatividade");
		bsm.add("Trabalho em Equipe");
		return bsm;
	}
	
	@GetMapping("Objetivos")
	public List<String> ListaObjetivos() {
		List<String> objetivos = new ArrayList<>();
		objetivos.add("Banco de Dados");
		objetivos.add("SQL");
		objetivos.add("Spring");
		objetivos.add("API");
		objetivos.add("REST");
		return objetivos;
	}

}
