package com.pryect1.EscenaDelCrimen.service;

import com.pryect1.EscenaDelCrimen.model.Movie;
import com.pryect1.EscenaDelCrimen.repository.MovieRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;


    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }

    public void deleteMovie(int id){
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(int id, Movie updatedMovie){
        updatedMovie.setId(id);
        return movieRepository.save(updatedMovie);
    }
    public List<Movie> getAllByOrder(){
        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, "title")).reversed();
    }

    public List<Movie> getByCategory(String category){
        return movieRepository.findByCategory(category);
    }


}