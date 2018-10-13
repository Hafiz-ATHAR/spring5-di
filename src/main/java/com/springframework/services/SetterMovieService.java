package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterMovieService implements Movie{

	@Override
	public String fetchMovie() {
		// TODO Auto-generated method stub
		return "Good Fellas- From Setter Movie Service";
	}

}
