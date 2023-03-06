package com.sii.academy.javaweek4_1.helpers;

import com.sii.academy.javaweek4_1.movielibrary.MovieLibrary;
import com.sii.academy.javaweek4_1.movielibrary.movie.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

final class SearchHelper {

    static List<Movie> findMoviesInDateRange(int beginYear, int endYear, List<MovieLibrary> libraries) {
        List<Movie> output = new ArrayList<>();
        libraries.forEach(el -> output.addAll(findMoviesInDateRange(beginYear, endYear, el)));
        return output;
    }

    static Movie findRandomMovieInLibrary(MovieLibrary library) {
        return library.getMovies().get(ThreadLocalRandom.current().nextInt(0, library.getMovies().size()));
    }

    static Movie findRandomMovieInLibrary(List<MovieLibrary> library) {
        List<Movie> allMovies = library.stream().map(MovieLibrary::getMovies).toList().stream().flatMap(List::stream).toList();
        return allMovies.get(ThreadLocalRandom.current().nextInt(0, allMovies.size()));
    }

    static List<String> findMoviesByActor(String firstName, String lastName, MovieLibrary library) {
        return library.getMovies().stream().filter(el -> el.getActorsList().stream().
                anyMatch(actor -> (actor.getName().equalsIgnoreCase(firstName)) && actor.getLastName().equalsIgnoreCase(lastName))).toList().stream().map(Movie::getTitle).toList();

    }

    static List<Movie> findMoviesInDateRange(int beginYear, int endYear, MovieLibrary library) {
        return library.getMovies().stream().filter(m -> (m.getReleaseYear() >= beginYear) && (m.getReleaseYear() <= endYear)).toList();
    }
}
