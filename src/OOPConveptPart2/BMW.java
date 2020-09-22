package OOPConveptPart2;

public class BMW extends Car { //"has-a relationship"
	//when smae methods is present in parent class as well as in child class with the  
	  //same name and same number of argument, is called Method Overriding.
	public void start() {
		System.out.println("BMW---start");
	}
	public void theftsafety() {
		System.out.println("BMW---theftsafety");
	}

}
