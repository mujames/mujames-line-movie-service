package com.mujames.movie.movieservice.repository;

import com.mujames.movie.movieservice.entity.MovieEnitity;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieEnitity, Long> {


}
