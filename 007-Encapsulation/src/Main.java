
public class Main {

	public static void main(String[] args) {
		
		Person john = new Person();
		john.setName("John");
		john.setAge(10);
		john.setGender("male");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.setAge(10));
		System.out.println(john.getGender());

	}

}
