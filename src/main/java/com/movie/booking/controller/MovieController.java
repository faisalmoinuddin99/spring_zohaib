package com.movie.booking.controller;

import com.movie.booking.model.Movie;
import com.movie.booking.service.MovieService;
import com.movie.booking.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class MovieController {

    @Autowired
    private MovieService service ;

    @GetMapping("/movies")
    public ResponseEntity< List<Movie>> getMovieList(){
        return ResponseEntity.ok(service.getMovieList()) ;
    }

    @GetMapping("/movies/{title}")
    public ResponseEntity< List<Movie>> getMovieByTitle(@PathVariable String title){
        return ResponseEntity.ok(service.getMovieByTitle(title)) ;
    }



}
