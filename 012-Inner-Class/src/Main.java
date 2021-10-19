
public class Main {

	public static void main(String[] args) {
		
		Door door = new Door();
		door.doorStatus();
		
		door.getLock().setlock(false);
		door.doorStatus();

	}

}
