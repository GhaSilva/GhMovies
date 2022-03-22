package com.ghabriel.ghmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghabriel.ghmovie.entities.User;


public interface UserRepository extends JpaRepository<User ,Long>{
 
	User findByEmail(String email);
}
