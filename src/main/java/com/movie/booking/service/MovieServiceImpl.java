package com.movie.booking.service;

import com.movie.booking.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MovieServiceImpl implements MovieService {

    static List<Movie> movieDB = new ArrayList<Movie>();

    static {


        Movie movie1 = new Movie(1,"Kisi ka Bhai kisi ka jaan", "Salman khan flop movie", 2.45,500.00,"abc.jpeg","comedy");
        Movie movie2 = new Movie(2,"Pathan","Sharuk khan movie",2.15,350.23,"srk.png","action") ;
        Movie movie3 = new Movie(3,"Avengers End Game","marvel movie",1.45,150.00,"marvel.png","action") ;
        Movie movie4 = new Movie(4,"SpiderMan No Way home", "spiderman movie", 3.12,10.10,"abc.jpeg","action");
        Movie movie5 = new Movie(5,"Kerala Stories", "flop movie", 3.45,1.00,"funny.jpeg","comedy");

        movieDB.add(movie1);
        movieDB.add(movie2);
        movieDB.add(movie3);
        movieDB.add(movie4);
        movieDB.add(movie5);
    }

    @Override
    public Movie addMovie(Movie movie) {
        movieDB.add(movie);
        return movie;
    }

    @Override
    public List<Movie> getMovieList() {
        return movieDB;
    }

    @Override
    public List<Movie> getMovieByTitle(String movieName) {
        return movieDB.stream().filter(movie -> movie.getTitle().equals(movieName)).collect(Collectors.toList());
    }
}
