package athar.springframwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import athar.springframwork.services.Movie;
import athar.springframwork.services.MovieServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("movieServiceImpl")
	private Movie movieServiceImpl;
	
	
	public String getMovie() {	
		return movieServiceImpl.fetchMovie();
	}
	
}
