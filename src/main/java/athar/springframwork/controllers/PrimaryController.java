package athar.springframwork.controllers;

import org.springframework.stereotype.Controller;

import athar.springframwork.services.Movie;

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
