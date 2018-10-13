package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryMovieService implements Movie{

	@Override
	public String fetchMovie() {
		// TODO Auto-generated method stub
		return "The Departed- From Primary Movie Service";
	}

}
