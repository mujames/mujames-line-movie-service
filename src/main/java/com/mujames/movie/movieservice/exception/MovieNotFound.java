package com.mujames.movie.movieservice.exception;

import java.util.NoSuchElementException;

public class MovieNotFound extends NoSuchElementException {

    public MovieNotFound(String m) {
        super(m);
    }

}
