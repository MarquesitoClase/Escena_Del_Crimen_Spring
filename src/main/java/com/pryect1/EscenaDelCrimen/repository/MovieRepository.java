package com.pryect1.EscenaDelCrimen.repository;

import com.pryect1.EscenaDelCrimen.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAll();
    Optional<Movie> findByID(Long id);
    Optional<Movie> findByTitle(String Title);
    void deleteById(Long id);
    void addMovie(Movie movie);
}
