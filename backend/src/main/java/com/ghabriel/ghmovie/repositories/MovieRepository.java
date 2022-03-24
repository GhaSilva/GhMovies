package com.ghabriel.ghmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghabriel.ghmovie.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie ,Long>{
 
}