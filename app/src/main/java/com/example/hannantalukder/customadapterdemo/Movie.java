package com.example.hannantalukder.customadapterdemo;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 3/30/2017.
 */

public class Movie {
    private String movieName;
    private String movieYear;
    private int movieImageId;

    public Movie(String movieName, String movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }

    public Movie(String movieName, String movieYear, int movieImageId) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieImageId = movieImageId;
    }

    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public int getMovieImageId() {
        return movieImageId;
    }

    public void setMovieImageId(int movieImageId) {
        this.movieImageId = movieImageId;
    }

    public ArrayList<Movie> getAllMovies()
    {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avater", "1997", R.drawable.avater));
        movies.add(new Movie("Avenger", "1997", R.drawable.avenger));
        movies.add(new Movie("Kunfu Panda", "1997", R.drawable.kunfu_panda));
        movies.add(new Movie("American Snipper", "1997", R.drawable.snipper));
        movies.add(new Movie("Moana", "1997", R.drawable.moana));
        movies.add(new Movie("xXx", "1997", R.drawable.xxx));
        movies.add(new Movie("Avater", "1997", R.drawable.avater));
        movies.add(new Movie("Avenger", "1997", R.drawable.avenger));
        movies.add(new Movie("Kunfu Panda", "1997", R.drawable.kunfu_panda));
        movies.add(new Movie("American Snipper", "1997", R.drawable.snipper));
        movies.add(new Movie("Moana", "1997", R.drawable.moana));
        movies.add(new Movie("xXx", "1997", R.drawable.xxx));
        movies.add(new Movie("Avater", "1997", R.drawable.avater));
        movies.add(new Movie("Avenger", "1997", R.drawable.avenger));
        movies.add(new Movie("Kunfu Panda", "1997", R.drawable.kunfu_panda));
        movies.add(new Movie("American Snipper", "1997", R.drawable.snipper));
        movies.add(new Movie("Moana", "1997", R.drawable.moana));
        movies.add(new Movie("xXx", "1997", R.drawable.xxx));movies.add(new Movie("Avater", "1997", R.drawable.avater));
        movies.add(new Movie("Avenger", "1997", R.drawable.avenger));
        movies.add(new Movie("Kunfu Panda", "1997", R.drawable.kunfu_panda));
        movies.add(new Movie("American Snipper", "1997", R.drawable.snipper));
        movies.add(new Movie("Moana", "1997", R.drawable.moana));






        return movies;
    }

}
