package JavaBasic;

public class ConstructorWithThisKeyword {
	//class vars
	//The "this" keyword refers to the current object in a method or constructor.
	//The most common use of the "this" keyword is to eliminate the confusion between class 
	//attributes and parameters with the same name
	String name;
	int age;
	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name;
		this.age= age;
		
		System.out.println(name);
		System.out.println(age);
	}
	

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);

	}

}
