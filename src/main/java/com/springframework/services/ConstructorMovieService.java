package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorMovieService implements Movie{

	@Override
	public String fetchMovie() {
		return "A walk to remember- From Constructor Movie Service ";
	}
	
	

}
