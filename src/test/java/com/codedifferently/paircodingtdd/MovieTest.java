package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest01(){

        Movie movie = new Movie("Spawn", Rating.PG13, 3.0, 122);

        String expected = "Movie: Spawn Rating: PG13 Ranking: 3.0";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest(){
        Movie movie = new Movie("Dark Knight Rises", Rating.R, 10.00, 200);

        movie.setTitle("Batman");
        String expected = "Batman";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRatingTest(){
        Movie movie = new Movie("Amistad", Rating.R, 9.5, 100);

        Rating expected = Rating.R;
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRankingTest(){
        Movie movie = new Movie("Get Out", Rating.R, 8.7, 150);

        Double expected = 8.7;
        Double actual = movie.getRanking();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinLengthTest(){
        Movie movie = new Movie("Casino Royale", Rating.PG13, 10.00, 150);

        Integer expected = 150;
        Integer actual = movie.getMinLength();
        Assertions.assertEquals(expected, actual);
    }
}
