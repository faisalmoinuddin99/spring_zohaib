package com.movie.booking.service;

import com.movie.booking.model.Movie;

import java.util.List;

public interface MovieService {
    public Movie addMovie(Movie movie) ;
    public List<Movie> getMovieList() ;
    public List<Movie> getMovieByTitle(String movieName) ;
}
