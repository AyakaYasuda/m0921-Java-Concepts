
public class Main {

	public static void main(String[] args) {
		
		Main object = new Main();
		
		object.case1(10, 5);
		object.case2(10, 0);
		

	}
	
	public void case1(int x, int y) {
		if(y != 0) {
			System.out.println(x/y);
		}else {
			System.out.println("The value of y is 0");
		}
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println(x/y);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		} catch (Exception e) {
			System.out.println("Inside exception block");
		}
	}

}
