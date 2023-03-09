package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.net.dto.City;
import com.java.net.dto.Movie;
import com.java.net.dto.MyObject;
import com.java.net.dto.Screen;
import com.java.net.dto.Seat;
import com.java.net.dto.Theater;

@Service
public class MyService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	public void createDetails(MyObject incomingRequest) {
		MyObject myObject = new MyObject();
//		Movie movie = restTemplate.postForObject("http://MOVIE/movie/", incomingRequest.getMovie(), Movie.class);
//		City city = restTemplate.postForObject("http://CITY/city/", incomingRequest.getCity(), City.class);
//		Screen screen = restTemplate.postForObject("http://SCREEN/screen/", incomingRequest.getScreen(), Screen.class);
//		Seat seat = restTemplate.postForObject("http://SEAT/seat/", incomingRequest.getSeat(), Seat.class);
//		Theater theater = restTemplate.postForObject("http://THEATER/theater/", incomingRequest.getTheater(), Theater.class);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		// create the request entity with the request body and headers
		HttpEntity<String> requestEntity = new HttpEntity<>(incomingRequest.getMovie().toString(), headers);
		System.out.println("befor calling MyOBJ movie ");
		Movie movie = restTemplate.postForObject("http://localhost:9001/movie/", requestEntity, Movie.class);
		System.out.println("After calling movie MyOBJ calling movie ");
		//City city = restTemplate.postForObject("http://localhost:9006/city/", incomingRequest.getCity(), City.class);
		//Screen screen = restTemplate.postForObject("http://localhost:9002/screen/", incomingRequest.getScreen(), Screen.class);
		//Seat seat = restTemplate.postForObject("http://localhost:9003/seat/", incomingRequest.getSeat(), Seat.class);
		//Theater theater = restTemplate.postForObject("http://localhost:9004/theater/", incomingRequest.getTheater(), Theater.class);
		myObject.setMovie(movie);
		//myObject.setCity(city);
		//myObject.setScreen(screen);
		//myObject.setSeat(seat);
		//myObject.setTheater(theater);
		System.out.println(myObject.toString());
		
	}
	

	

}
