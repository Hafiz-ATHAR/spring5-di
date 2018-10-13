package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.services.Movie;
import com.springframework.services.MovieServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("movieServiceImpl")
	private Movie movieServiceImpl;
	
	
	public String getMovie() {	
		return movieServiceImpl.fetchMovie();
	}
	
}
