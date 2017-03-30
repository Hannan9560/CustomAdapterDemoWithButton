package com.example.hannantalukder.customadapterdemo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Hannan Talukder on 3/30/2017.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {
    private Context context;
    private ArrayList<Movie>movies;

    public MovieAdapter(@NonNull Context context, ArrayList<Movie>movies) {
        super(context, R.layout.row_layout,movies);
        this.context = context;
        this.movies = movies;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row_layout,parent,false);
        ImageView movieImageView = (ImageView) convertView.findViewById(R.id.myImage);
        TextView movieName = (TextView) convertView.findViewById(R.id.movieName);
        TextView movieYear = (TextView) convertView.findViewById(R.id.movieYear);
        Button phnButton = (Button) convertView.findViewById(R.id.phonebtn);


        movieName.setText(movies.get(position).getMovieName());
        movieYear.setText(movies.get(position).getMovieYear());
        movieImageView.setImageResource(movies.get(position).getMovieImageId());
        phnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hello"+position, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
