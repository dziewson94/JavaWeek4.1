package com.sii.academy.javaweek4_1.main;

import com.google.gson.Gson;
import com.sii.academy.javaweek4_1.helpers.MovieHelper;
import com.sii.academy.javaweek4_1.movielibrary.movie.worker.Actor;
import com.sii.academy.javaweek4_1.movielibrary.MovieLibrary;
import com.sii.academy.javaweek4_1.movielibrary.movie.Movie;
import com.sii.academy.javaweek4_1.movielibrary.movie.type.MovieType;
import com.sii.academy.javaweek4_1.movielibrary.movie.worker.Director;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static MovieHelper helper;

    public static void main(String[] args) {
        List<MovieLibrary> allLibraries = MovieHelper.loadDataFromResources();
        helper = new MovieHelper(allLibraries.get(0));
        run();
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        while (!finish) {
            System.out.println("Select 1 to find movie in date rage\n" +
                    "Select 2 to print random movie details\n" +
                    "Select 3 to find actor all movies\n" +
                    "4 to quit");
            int x = scanner.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Provide begin date");
                    int beginDate = scanner.nextInt();
                    System.out.println("Provide end date");
                    int endDate = scanner.nextInt();
                    helper.findMoviesInDataRange(beginDate, endDate).forEach(System.out::println);
                }
                case 2 -> {
                    helper.printRandomMovieDetail();
                }
                case 3 -> {
                    System.out.println("Provide actor name");
                    String name = scanner.nextLine();
                    System.out.println("Provide actor last name");
                    String lastName = scanner.nextLine();
                    helper.printActorMovies(name, lastName);
                }
                default -> finish = true;
            }
        }
    }

    private static void beLazyGenerateJsonTemplateFilesUsingGson() {
        Actor mainActor = new Actor("Alan", "Dudniety");
        Actor secondActor = new Actor("Don", "Mateo");
        List<Actor> actors = new ArrayList<>();
        actors.add(mainActor);
        actors.add(secondActor);

        Director director = new Director("GodJarro", "Quacklord");
        Movie movie = new Movie("Not only moon, but whole country", 2015, director, actors, MovieType.HORROR
        );
        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        MovieLibrary library = new MovieLibrary(movies);
        Gson gson = new Gson();
        String content = gson.toJson(library, MovieLibrary.class);
    }
}