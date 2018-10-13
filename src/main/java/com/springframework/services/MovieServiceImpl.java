package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements Movie {

	public static final String MOVIE = "Interstaller";

    @Override
    public String fetchMovie() {
        return MOVIE;
    }
}
