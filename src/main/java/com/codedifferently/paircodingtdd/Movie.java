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
        return rating;
    }
    public Double getRanking() {
        return ranking;
    }

    public String getTitle() {
        return null;
    }

    public void setTitle(String title) {

    }
    public void setRating(Rating rating) {
        this.rating= rating;
    }
    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
    @Override
    public String toString() {
        return "Movie: " + title + " " +
                "Rating: " + rating + " "
                + "Ranking: " + ranking;
    }
}
