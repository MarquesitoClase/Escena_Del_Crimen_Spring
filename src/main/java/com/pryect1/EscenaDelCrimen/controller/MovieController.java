package com.pryect1.EscenaDelCrimen.controller;

import com.pryect1.EscenaDelCrimen.model.Movie;
import com.pryect1.EscenaDelCrimen.repository.MovieRepository;
import com.pryect1.EscenaDelCrimen.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {

    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public void createMovie(@RequestBody Movie movie){
         movieService.addMovie(movie);
    }

    @PostMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieService.getAll();
    }

    @DeleteMapping("/novies/{id")
    public void deleteMovie(@PathVariable int id){
        movieService.deleteMovie(id);
    }
}
