package athar.springframwork.controllers;

import org.springframework.stereotype.Controller;

import athar.springframwork.services.MovieServiceImpl;

@Controller
public class PropertyInjectedController {

	private MovieServiceImpl movie;
	
	public String getMovie() {	
		return movie.fetchMovie();
	}
	
}
