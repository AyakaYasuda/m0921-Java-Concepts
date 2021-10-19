import java.io.FileNotFoundException;

public class Main3 {

	public static void main(String[] args) {
		
		try {	
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method (filenotfound)");
		} catch (Exception e) {
			System.out.println("catch block of main method (exception)");
		}

	}
	
	public static void someMethod() throws Exception {
		System.out.println("Messege from someMethod");
		System.out.println(10/5);
		throw new Exception(); // force the exception execute
	}

}
