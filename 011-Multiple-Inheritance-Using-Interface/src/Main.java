
public class Main {

	public static void main(String[] args) {
		
		Person john = new Vegan();
		john.speak();
		john.eat();
		john.breathe();
		john.message();
		
		System.out.println("-------------------------");
		
		Person jane = new NonVegan();
		jane.speak();
		jane.eat();

	}

}

