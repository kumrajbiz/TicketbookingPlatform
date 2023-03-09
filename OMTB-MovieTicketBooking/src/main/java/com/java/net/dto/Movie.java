package com.java.net.dto;

import org.springframework.context.annotation.Configuration;


@Configuration
public class Movie {
    private String movieName;
    private String movieCategory;
    private String movieGender;
    private String movieLanguage;
	public String getMovieName() {
		return movieName;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public String getMovieGender() {
		return movieGender;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public void setMovieGender(String movieGender) {
		this.movieGender = movieGender;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public Movie(String movieName, String movieCategory, String movieGender, String movieLanguage) {
		super();
		this.movieName = movieName;
		this.movieCategory = movieCategory;
		this.movieGender = movieGender;
		this.movieLanguage = movieLanguage;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieCategory=" + movieCategory + ", movieGender=" + movieGender
				+ ", movieLanguage=" + movieLanguage + "]";
	}

    // getters and setters
}

