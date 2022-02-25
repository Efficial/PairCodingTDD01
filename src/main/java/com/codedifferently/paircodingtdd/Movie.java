package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;
    private Double ranking;
    private Integer minLength;


    public Movie(String title, Rating rating, Double ranking, Integer minLength){
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
        this.minLength = minLength;
    }

    public Rating getRating() {
        return rating;
    }
    public Double getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setRating(Rating rating) {
        this.rating= rating;
    }
    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " " +
                "Rating: " + rating + " "
                + "Ranking: " + ranking + " "
                + "Length: " + minLength;
    }
}
