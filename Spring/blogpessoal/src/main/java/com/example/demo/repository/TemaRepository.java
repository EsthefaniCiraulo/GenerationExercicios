package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}