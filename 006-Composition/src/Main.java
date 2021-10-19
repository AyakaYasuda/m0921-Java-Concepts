
public class Main {
	
	public static void main(String[] args) {
		
		Processor processor = new Processor();
		GraphicsCard gpu = new GraphicsCard();
		
		Laptop gamingLaptop = new Laptop();
		System.out.println(gamingLaptop);
		
		gamingLaptop.gamingMode();
		System.out.println("Gaming mode ON");
		System.out.println("Current Frequency: " + gamingLaptop.getProcessor().getFrequency());
	}

}
