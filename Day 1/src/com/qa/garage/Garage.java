package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	public static void main(String[] args) {
		ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		
		Vehicle car1 = new Car(197461, 4, 120, 5);
		Vehicle car2 = new Car(177234, 3, 90, 3);
		Vehicle motorbike1 = new Motorbike(444718, 2, 130, true);
		
		listOfVehicles.add(car1);
		listOfVehicles.add(car2);
		listOfVehicles.add(motorbike1);
		
		readArrayList(listOfVehicles);
		
		System.out.println("Total bill: �" + calcBill(listOfVehicles));
		
		deleteVehicle(listOfVehicles, 197461);
		
		readArrayList(listOfVehicles);
		
	}
	
	public static int calcBill(ArrayList<Vehicle> list) {
		int bill = 0;
		
		for (Vehicle vehicle: list) {
			System.out.println("Added �" + vehicle.getNoOfWheels() + " to the bill for " + vehicle);
			bill += vehicle.getNoOfWheels();
		}
		
		return bill;
	}
	
	public static void deleteVehicle(ArrayList<Vehicle> list, int vehicleID) {
		for (int i = 0; i<list.size(); i++) {
			if (list.get(i).getId() == vehicleID) {
				System.out.println("removing " + list.get(i) + "with ID: " + list.get(i).getId() + "...");
				list.remove(i);
			}
			
		}
	}
	
	public static void readArrayList(ArrayList<Vehicle> list) {
		System.out.println("Reading the ArrayList...");
		for (Vehicle vehicle: list) {
			System.out.println(vehicle + "       ID: " + vehicle.getId());
		}
	}

}
