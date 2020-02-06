package com.lucasmourao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmourao.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
