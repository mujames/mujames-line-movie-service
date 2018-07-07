package com.mujames.movie.movieservice.feature.movie.create.controller;

import com.mujames.movie.movieservice.constant.regex.ActionType;
import com.mujames.movie.movieservice.feature.movie.create.domain.CreateMovieRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateMovieController {

    @PostMapping("api/v1/movies")
    public void createMovie(
            @Validated(ActionType.Create.class) @RequestBody CreateMovieRequest createMovieRequest){

    }

    @PutMapping("api/v1/movie/{movie_id}")
    public String updateMovie(
            @PathVariable(name = "movie_id") String movieId
    ){
        return movieId;
    }

    @GetMapping("api/v1/movies")
    public String getMovie(){

        return "Hello";
    }
}
