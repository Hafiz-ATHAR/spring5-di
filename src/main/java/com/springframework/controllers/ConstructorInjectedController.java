package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.Movie;

@Controller
public class ConstructorInjectedController {

private Movie movie;
	
	public ConstructorInjectedController(@Qualifier("constructorMovieService")	Movie movie) {
		this.movie = movie;
	}
	
	public String getMovie() {
		
		return movie.fetchMovie();
	}
}
