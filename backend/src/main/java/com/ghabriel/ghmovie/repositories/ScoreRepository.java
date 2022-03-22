package com.ghabriel.ghmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghabriel.ghmovie.entities.Score;
import com.ghabriel.ghmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score ,ScorePK>{
 
}
