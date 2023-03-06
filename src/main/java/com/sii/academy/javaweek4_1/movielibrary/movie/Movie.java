package com.sii.academy.javaweek4_1.movielibrary.movie;

import com.sii.academy.javaweek4_1.movielibrary.movie.type.MovieType;
import com.sii.academy.javaweek4_1.movielibrary.movie.worker.Actor;
import com.sii.academy.javaweek4_1.movielibrary.movie.worker.Director;

import java.util.List;

public class Movie {

    private String title;
    private int releaseYear;

    private Director director;

    private List<Actor> actorsList;

    private MovieType movieType;

    public Movie(String title, int releaseYear, Director director, List<Actor> actorsList, MovieType movieType) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
        this.actorsList = actorsList;
        this.movieType = movieType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<Actor> actorsList) {
        this.actorsList = actorsList;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    private String getActorsAsString() {
        StringBuilder builder = new StringBuilder();
        actorsList.forEach(builder::append);
        return builder.substring(0, builder.length() - 1);
    }

    @Override
    public String toString() {
        return String.format("Title:%s%n director:%s %s%n genre:%s%n date: %d%n actors:%s%n",
                title, director.getName(), director.getLastName(), movieType, releaseYear, getActorsAsString());
    }
}
