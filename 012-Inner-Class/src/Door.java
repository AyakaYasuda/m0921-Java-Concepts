
public class Door {
	
	private Lock lock;
	
	public Door() {
		this.lock = new Lock(true);
	}
	
	public Lock getLock() {
		return lock;
	}
	
	public void doorStatus() {
		if(lock.isLock()) {
			System.out.println("Door is closed");
		} else {
			System.out.println("Door is open");
		}
	}

	
	public class Lock {
		private boolean lock;
		
		public Lock(boolean lock) {
			this.lock = lock;
		}
		
		public boolean isLock() {
			return lock;
		}
		
		public void setlock(boolean lock) {
			this.lock = lock;
		}
	}

}
