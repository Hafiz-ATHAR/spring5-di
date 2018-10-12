package athar.springframwork.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import athar.springframwork.services.Movie;

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
