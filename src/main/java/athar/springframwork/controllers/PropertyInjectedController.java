package athar.springframwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import athar.springframwork.services.MovieServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	private MovieServiceImpl movie;
	
	
	public String getMovie() {	
		return movie.fetchMovie();
	}
	
}
