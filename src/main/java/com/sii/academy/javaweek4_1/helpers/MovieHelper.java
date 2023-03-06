package com.sii.academy.javaweek4_1.helpers;

import com.sii.academy.javaweek4_1.movielibrary.MovieLibrary;
import com.sii.academy.javaweek4_1.movielibrary.movie.Movie;

import java.util.List;

public class MovieHelper {

    private MovieLibrary library;

    public MovieHelper(MovieLibrary library) {
        this.library=library;
    }

    public  void saveStringToFile(String content, String path) {
        FileHelper.saveStringToFile(content, path);
    }
    public List<Movie> findMoviesInDataRange(int beginDate, int endDate) {
       return SearchHelper.findMoviesInDateRange(beginDate,endDate,this.library);
    }
    public void printRandomMovieDetail() {
        System.out.println(SearchHelper.findRandomMovieInLibrary(this.library));
    }

    public void printActorMovies(String actorName,String actorLastname) {
        StringBuilder builder = new StringBuilder();
        SearchHelper.findMoviesByActor(actorName,actorLastname,library).forEach(builder::append);
        System.out.println(builder);
    }

    public static List<MovieLibrary> loadDataFromResources() {
        return DataHelper.loadPredefinedLibraries("movie-libraries");
    }
}
