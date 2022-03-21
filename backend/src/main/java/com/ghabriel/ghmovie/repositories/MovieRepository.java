package com.ghabriel.ghmovie.repositories;

import com.ghabriel.ghmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie ,Long>{
 
}
