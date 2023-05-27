package com.movie.booking.model;


import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    private int id ;
    private String title ;
    private String description ;
    private double duration;
    private double ticketPrice ;
    private String poster ;
    private String genre ;

}
