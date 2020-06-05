package JavaBasic;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Default const");
		
	}
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
		System.out.println("the value of i "+i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("two param construction");
		System.out.println("value of i "+i);
		System.out.println("value of j "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept obj = new ConstructorConcept(); 
		ConstructorConcept ob1 = new ConstructorConcept(10); 
		ConstructorConcept ob2 = new ConstructorConcept(20,30); 


}
}
