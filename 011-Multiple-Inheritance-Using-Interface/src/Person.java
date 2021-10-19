
public abstract class Person implements IsAlive, StayAlive {
	
	public void speak() {
		System.out.println("Share his/her thoughts...");
	}
	
	/* 
	ensures that any class that extends our abstract class 
	must provide the bare minimum functionality to work
	*/
	public abstract void eat();
	
	@Override
	public void breathe() {
		System.out.println("breathing...");
		
	}

	@Override
	public void message() {
		System.out.println("some message....");
		
	}


}
