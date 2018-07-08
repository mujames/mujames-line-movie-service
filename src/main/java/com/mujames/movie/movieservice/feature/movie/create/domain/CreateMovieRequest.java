package com.mujames.movie.movieservice.feature.movie.create.domain;

import com.mujames.movie.movieservice.constant.regex.GenreEnum;
import lombok.Data;

import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class CreateMovieRequest {

    @NotNull @Max(200)
    public String name;

    @NotNull
    @Enumerated
    public GenreEnum genre;

    public String directBy;
    public String studio;
    public Long budget;

}
