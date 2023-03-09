package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Seat {
    private String seatType;
    private int noOfSeat;
    private int totalSeat;
    private String seatCategory;
	public String getSeatType() {
		return seatType;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public String getSeatCategory() {
		return seatCategory;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public void setSeatCategory(String seatCategory) {
		this.seatCategory = seatCategory;
	}
	public Seat(String seatType, int noOfSeat, int totalSeat, String seatCategory) {
		super();
		this.seatType = seatType;
		this.noOfSeat = noOfSeat;
		this.totalSeat = totalSeat;
		this.seatCategory = seatCategory;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Seat [seatType=" + seatType + ", noOfSeat=" + noOfSeat + ", totalSeat=" + totalSeat + ", seatCategory="
				+ seatCategory + "]";
	}

   
}

