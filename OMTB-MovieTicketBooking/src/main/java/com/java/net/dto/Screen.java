package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Screen {
    private String screenType;
    private String noOfScreen;
	public String getScreenType() {
		return screenType;
	}
	public String getNoOfScreen() {
		return noOfScreen;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public void setNoOfScreen(String noOfScreen) {
		this.noOfScreen = noOfScreen;
	}
	public Screen(String screenType, String noOfScreen) {
		super();
		this.screenType = screenType;
		this.noOfScreen = noOfScreen;
	}
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Screen [screenType=" + screenType + ", noOfScreen=" + noOfScreen + "]";
	}

    
}

