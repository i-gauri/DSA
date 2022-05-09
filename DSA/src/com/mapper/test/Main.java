package com.mapper.test;

import com.mapper.core.Category;
import com.mapper.core.Fuel;
import com.mapper.main.Mapper;
import com.mapper.pojos.Car;
import com.mapper.pojos.CarDTO;

public class Main {
	
	public static Car getCarObject () {
		Car benz = new Car();
		benz.setName("Mercedes-Benz");
		benz.setModel("GLE Coupe");
		benz.setCategory(Category.Coupe);
		benz.setFuel(Fuel.PETROL);
		benz.setManufacturer("Mercedes-Benz");
		benz.setMileage(10);
		benz.setSeats(5);
		benz.setPrice(2.15);
		return benz;
	}
	
	public static CarDTO getCarDTOObject () {
		CarDTO benzDTO = new CarDTO();
		benzDTO.setFuel(Fuel.PETROL);
		benzDTO.setMileage(15);
		benzDTO.setPrice(2.5);
		//benzDTO.setSeats(7);
		return benzDTO;
	}

	public static void main(String[] args) {
		Car benz = getCarObject();
		CarDTO benzDTO = getCarDTOObject();
		
		System.out.println("Before Mapping " + benz);
		//System.out.println(benzDTO);
		
		Mapper mapper = new Mapper();
		try {
			mapper.map(benzDTO, benz);
			System.out.println("After  Mapping " + benz);
			//System.out.println(benzDTO);
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
