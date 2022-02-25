package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;

    public Movie(String title, Rating rating){
        this.title = title;
        this.rating = rating;
    }

    public Rating getRating() {
        return null;
    }

    public void setRating(Rating rating) {

    }

    public String getTitle() {
        return null;
    }

    public void setTitle(String title) {
    }

    @Override
    public String toString() {
        return "Movie: " + title + " " + "Rating: " + rating;
    }
}
