package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.Movie;

@Controller
public class SetterInjectedController {

	private Movie movie;

	@Autowired
	public void setGreeting(@Qualifier("setterMovieService")	Movie movie) {
		this.movie = movie;
	}


	public String getMovie() {
		return movie.fetchMovie();
	}
}
