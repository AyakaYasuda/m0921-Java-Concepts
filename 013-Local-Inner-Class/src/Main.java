
public class Main {

	public static void main(String[] args) {
		
		// test for Run Configurations
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Door door = new Door();
		
		if(door.isLocked(args[0])) {
			System.out.println("Door is closed");
		} else {
			System.out.println("Door is open");
		}

	}

}
