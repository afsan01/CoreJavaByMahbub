package OOPSConnceptPart1;

public class StaticNonStaticConcept {

	String name = "Steave";//non static global variable
	static int age = 45; //static global variable
	
	public static void main(String[] args) {

		//how to call static method and vars:
		//1.direct calling
		sum();
		//2.call by class name:
		StaticNonStaticConcept.sum();
	}
	
	public void sendMail() {
		System.out.println("Send Mail Methos");
	}

	public static void sum() {
		System.out.println("Sum Method");
	}
}
