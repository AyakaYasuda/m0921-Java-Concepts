package com.finalvariable;

public class Vehicle {
		
	final int speedLimit = 60;
		
	void controlSpeed() {
			speedLimit = 150;
	}
	// An error happens as the final field cannot be assigned
		
	public static void main(String[] args) {
		
		Vehicle objVehicle = new Vehicle();
		objVehicle.controlSpeed();
	}

}
