package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test

    public void constructorTest01(){

        Movie movie = new Movie("Spawn", Rating.PG13);

        String expected = "Movie: Spawn Rating: PG13";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

}
