
public class Main {

	public static void main(String[] args) {
		
		Phone note8 = new Samsung("Note 8");
		System.out.println(note8.getModel());
		note8.features();
		
		Phone nokia3310 = new Nokia("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();

	}

}
