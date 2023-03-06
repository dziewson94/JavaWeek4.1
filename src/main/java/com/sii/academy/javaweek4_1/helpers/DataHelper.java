package com.sii.academy.javaweek4_1.helpers;

import com.google.gson.Gson;
import com.sii.academy.javaweek4_1.movielibrary.MovieLibrary;

import java.util.ArrayList;
import java.util.List;

final class DataHelper {

    // public static List<MovieLibrary> loadPreCreatedMovieLibrariesFromResources

    static MovieLibrary parseMovieLibraryFromJSONFile(String path) {
        Gson gsonParser = new Gson();
        String fileContentAsJSONString = FileHelper.readFileFromResourcesAsString(path);
        return gsonParser.fromJson(fileContentAsJSONString, MovieLibrary.class);
    }

    static List<MovieLibrary> loadPredefinedLibraries(String dirName) {
        List<MovieLibrary> libraries = new ArrayList<>();
        FileHelper.getResourceFolderFiles(dirName).forEach(el -> libraries.add(parseMovieLibraryFromJSONFile(el)));
        return libraries;
    }
}
