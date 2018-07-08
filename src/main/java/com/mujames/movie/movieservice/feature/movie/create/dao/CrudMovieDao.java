package com.mujames.movie.movieservice.feature.movie.create.dao;

import com.mujames.movie.movieservice.entity.MovieEnitity;
import com.mujames.movie.movieservice.exception.MovieNotFound;
import com.mujames.movie.movieservice.feature.movie.create.domain.CreateMovieRequest;
import com.mujames.movie.movieservice.feature.movie.create.domain.UpdateMovieRequest;
import com.mujames.movie.movieservice.repository.MovieRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CrudMovieDao {

    @Autowired
    private MovieRepository movieRepository;

    public void createMovie(CreateMovieRequest createMovieRequest){

        MovieEnitity movieEnitity = new MovieEnitity();
        BeanUtils.copyProperties(createMovieRequest, movieEnitity);
        movieRepository.save(movieEnitity);

    }

    public void updateMovie(String id,UpdateMovieRequest updateMovieRequest){

        verifyMovieExisting(id);
        MovieEnitity movieEnitity = new MovieEnitity();
        BeanUtils.copyProperties(updateMovieRequest, movieEnitity);
        movieRepository.save(movieEnitity);

    }

    public void verifyMovieExisting(String id){

        try {
            movieRepository.findById(Long.parseLong(id)).orElseThrow(IllegalArgumentException::new);
        }catch(IllegalArgumentException e){
            throw new MovieNotFound(e.getMessage());
        }

    }

}
