package com.simplilearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Movie;
import com.simplilearn.repository.MovieRespository;

@Service
public class MovieService {

	@Autowired
	MovieRespository movieRespository;

	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movieRespository.findAll().forEach(movie -> movies.add(movie));
		return movies;
	}
	
	public void saveMovie(Movie movie) {
		movieRespository.save(movie);
	}
	
	public void delete(int id) {
		movieRespository.deleteById(id);
	}

}
