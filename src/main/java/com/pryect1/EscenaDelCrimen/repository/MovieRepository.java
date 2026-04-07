package com.pryect1.EscenaDelCrimen.repository;

import com.pryect1.EscenaDelCrimen.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByCategory(String category);
}