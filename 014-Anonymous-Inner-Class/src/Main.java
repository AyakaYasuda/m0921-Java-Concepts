
public class Main {

	public static void main(String[] args) {
		
		Door door = new Door();
		if(door.getLock().isUnlocked("qwerty")) {
			System.out.println("Door is open");
		} else {
			System.out.println("Door is closed");
		}

	}

}
