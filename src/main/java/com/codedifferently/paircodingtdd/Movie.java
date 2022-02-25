package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;
    private Double ranking;





    public Movie(String title, Rating rating, Double ranking){
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
    }

    public Rating getRating() {
        return null;
    }
    public Double getRanking() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public void setTitle(String title) {

    }
    public void setRating(Rating rating) {

    }
    public void setRanking(double ranking) {

    }
    @Override
    public String toString() {
        return "Movie: " + title + " " + "Rating: " + rating + " " + "Ranking: " + ranking;
    }
}
