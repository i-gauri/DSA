package com.mapper.pojos;

import com.mapper.core.Fuel;

public class CarDTO {
	private Fuel fuel;
	private int seats;
	private double price;
	private double mileage;
	
	public Fuel getFuel() {
		return fuel;
	}
	
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "CarDTO [fuel=" + fuel + ", seats=" + seats + ", price=" + price + ", mileage=" + mileage + "]";
	}
}
