
public class Person {

	private String name;
	private int age;
	private String gender;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public boolean setAge(int age) {
		if(age >= 0 && age <= 100) {
			this.age = age;
			return true;
		}
		return false;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
