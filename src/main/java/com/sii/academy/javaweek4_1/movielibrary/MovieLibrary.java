package com.sii.academy.javaweek4_1.movielibrary;

import com.sii.academy.javaweek4_1.movielibrary.movie.Movie;

import java.util.List;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "MovieLibrary{" +
                "movies=" + movies +
                '}';
    }
}
