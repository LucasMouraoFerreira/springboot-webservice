package com.lucasmourao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmourao.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
