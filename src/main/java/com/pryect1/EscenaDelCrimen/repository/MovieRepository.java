package com.pryect1.EscenaDelCrimen.repository;

import com.pryect1.EscenaDelCrimen.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
