package com.qa.garage;

public class Vehicle {
	private int id;
	private int noOfWheels = 4;
	private int bhp;
	
	public Vehicle(int id, int noOfWheels, int bhp) {
		this.id = id;
		this.noOfWheels = noOfWheels;
		this.bhp = bhp;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public int getBhp() {
		return bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
}
