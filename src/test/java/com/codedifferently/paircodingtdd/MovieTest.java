package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest01(){

        Movie movie = new Movie("Spawn", Rating.PG13, 3.0);

        String expected = "Movie: Spawn Rating: PG13 Ranking: 3.0";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRankingTest(){
        Movie movie = new Movie("Get Out", Rating.R, 8.7);

        Double expected = 8.7;
        Double actual = movie.getRanking();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRatingTest(){
        Movie movie = new Movie("Amistad", Rating.R, 9.5);

        Rating expected = Rating.R;
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }

}
