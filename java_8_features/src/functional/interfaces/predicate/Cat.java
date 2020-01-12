package functional.interfaces.predicate;

public class Cat {
	
	private String name;
	private float age;
	
	public Cat(String name, float age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public float getAge() {
		return age;
	}
}
