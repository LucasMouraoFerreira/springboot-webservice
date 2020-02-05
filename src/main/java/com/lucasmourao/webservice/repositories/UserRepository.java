package com.lucasmourao.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmourao.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
