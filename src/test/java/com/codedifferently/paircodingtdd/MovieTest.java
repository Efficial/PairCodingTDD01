package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test

    public void constructorTest01(){

        Movie movie = new Movie("Spawn");

        String expected = "Movie: Spawn";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

}
