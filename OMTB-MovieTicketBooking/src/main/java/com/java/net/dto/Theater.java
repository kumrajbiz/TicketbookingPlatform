package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Theater {
    private String theaterName;
    private String theaterLocation;
    private String theaterCity;
    private String theaterType;
	public String getTheaterName() {
		return theaterName;
	}
	public String getTheaterLocation() {
		return theaterLocation;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public String getTheaterType() {
		return theaterType;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public void setTheaterType(String theaterType) {
		this.theaterType = theaterType;
	}
	public Theater(String theaterName, String theaterLocation, String theaterCity, String theaterType) {
		super();
		this.theaterName = theaterName;
		this.theaterLocation = theaterLocation;
		this.theaterCity = theaterCity;
		this.theaterType = theaterType;
	}
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Theater [theaterName=" + theaterName + ", theaterLocation=" + theaterLocation + ", theaterCity="
				+ theaterCity + ", theaterType=" + theaterType + "]";
	}

    
}

