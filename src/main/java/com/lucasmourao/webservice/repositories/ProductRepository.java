package com.lucasmourao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmourao.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
