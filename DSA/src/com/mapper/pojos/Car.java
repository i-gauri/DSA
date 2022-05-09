package com.mapper.pojos;

import com.mapper.core.Category;
import com.mapper.core.Fuel;

public class Car {
	private String name;
	private String model;
	private String manufacturer;
	private int seats;
	private double mileage;
	private Category category;
	private Fuel fuel;
	private double price;
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Fuel getFuel() {
		return fuel;
	}
	
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", seats=" + seats
				+ ", mileage=" + mileage + ", category=" + category + ", fuel=" + fuel + ", price=" + price + "]";
	}
}
