package com.mujames.movie.movieservice.feature.movie.create.domain;

import com.mujames.movie.movieservice.constant.ActionType;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateMovieRequest {

    @NotNull(groups = ActionType.class)
    public String name;

}
