abstract class Lock {
	public abstract boolean isUnlocked(String key);
}

public class Door {
	
	
	private Lock lock = new Lock() {

		// anonymous inner class
		@Override
		public boolean isUnlocked(String key) {
			if(key.equals("qwerty")) {
				return true;
			}else {
				return false;
			}
		}
		
	};
	
	public Lock getLock() {
		return lock;
	}
}

