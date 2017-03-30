package com.example.hannantalukder.customadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private Movie movie;
    private ArrayList<Movie>movies;
    private MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.myList);
        movie = new Movie();
        movies = movie.getAllMovies();

        movieAdapter = new MovieAdapter(this,movies);
        mListView.setAdapter(movieAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, movies.get(position).getMovieName(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
