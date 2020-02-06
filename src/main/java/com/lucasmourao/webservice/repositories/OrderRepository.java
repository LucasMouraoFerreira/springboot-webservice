package com.lucasmourao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmourao.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
