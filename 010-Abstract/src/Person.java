
public abstract class Person {
	
	public void speak() {
		System.out.println("Share his/her thoughts...");
	}
	
	/* 
	ensures that any class that extends our abstract class 
	must provide the bare minimum functionality to work
	*/
	public abstract void eat();

}
