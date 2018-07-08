package com.mujames.movie.movieservice.utils;

public class NumberUtils {

    private final String DEFAULT_FAIL_PARSE = "";

    public static Long stringToLong(String s){
        try {
            return Long.parseLong(s);
        } catch(NumberFormatException e){
            return null;
        }
    }

}
