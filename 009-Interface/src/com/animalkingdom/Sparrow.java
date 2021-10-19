package com.animalkingdom;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
		
	}

	@Override
	public void fly() {
		System.out.println("Sparrow flying....");
		
	}
	
//	public void fly() {
//		System.out.println("Sparrow flying....");
//	}

}
