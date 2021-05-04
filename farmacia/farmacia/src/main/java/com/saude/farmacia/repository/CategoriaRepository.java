package com.saude.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saude.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	

}
