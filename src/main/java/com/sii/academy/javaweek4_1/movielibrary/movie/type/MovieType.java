package com.sii.academy.javaweek4_1.movielibrary.movie.type;

public enum MovieType {
    ACTION("Action movie"),
    HORROR("Horror"),
    COMEDY("Comedy"),
    THRILLER("Thriller");

    private final String type;

    MovieType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
