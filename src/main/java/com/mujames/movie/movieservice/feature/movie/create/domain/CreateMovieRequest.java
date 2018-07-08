package com.mujames.movie.movieservice.feature.movie.create.domain;

import com.mujames.movie.movieservice.constant.GenreEnum;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class CreateMovieRequest {

    @NotNull @Length(max = 128)
    public String name;

    @NotNull
    public GenreEnum genre;

    @NotNull @Length(max = 64)
    public String directBy;
    public String studio;
    public Long budget;

}
