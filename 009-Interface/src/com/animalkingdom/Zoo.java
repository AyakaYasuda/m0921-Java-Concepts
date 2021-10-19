package com.animalkingdom;

public class Zoo {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(12, "M", 20);
//		animal.move();
		
		Bird bird = new Bird(12, "M", 20);
		moveAnimal(bird);
		
		Sparrow sparrow = new Sparrow(0, null, 0);
		sparrow.fly();
		
		chicken chick = new chicken(0, null, 0);
		moveAnimal(chick);
		
		Fish fish = new Fish(0, null, 0);
		moveAnimal(fish);
	
	}
	// Polymorphism
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
