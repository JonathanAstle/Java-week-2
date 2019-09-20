package com.qa.garage;

public class Car extends Vehicle {
	private int noOfDoors;
	
	public Car(int id, int noOfWheels, int bhp, int noOfDoors) {
		super(id, noOfWheels, bhp);
		this.noOfDoors = noOfDoors;
	}

}
