package com.mujames.movie.movieservice.feature.movie.create.domain;

import com.mujames.movie.movieservice.constant.regex.ActionType;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateMovieRequest {

    @NotNull(groups = ActionType.class)
    public String name;

}
