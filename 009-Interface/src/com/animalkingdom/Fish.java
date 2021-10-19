package com.animalkingdom;

public class Fish extends Animal{

	public Fish(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming....");
		
	}

}
