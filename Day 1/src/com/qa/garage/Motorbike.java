package com.qa.garage;

public class Motorbike extends Vehicle {
	public boolean canDoWheelie = true;
	
	public Motorbike(int id, int bhp, int noOfWheels, boolean canDoWheelie) {
		super(id, bhp, noOfWheels);
		this.canDoWheelie = canDoWheelie;
	}
	
	public void setCanDoWheelie(boolean canDoWheelie) {
		this.canDoWheelie = canDoWheelie;
	}
	
	public boolean getCanDoWheelie() {
		return canDoWheelie;
	}
	
}
