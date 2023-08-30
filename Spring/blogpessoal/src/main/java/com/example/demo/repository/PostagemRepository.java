package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
}
