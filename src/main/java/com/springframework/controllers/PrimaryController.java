package com.springframework.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.services.Movie;

@Controller
public class PrimaryController {

	private Movie movie;
	
	public PrimaryController(Movie movie) {
		this.movie = movie;
	}
	
	public String getMovie() {
		
		return movie.fetchMovie();
	}
}
