package JavaBasic;

public class LoopConcept {

	public static void main(String[] args) {

		//1.while loop
		//dis-advantage of while loop: it will generate infinite loop if you don'd give incremental/decremental part.
		int i = 0;  //initialization
		while (i<=10) {  //conditional
			System.out.println(i);
			i=i+1; //incremental
		}
		System.out.println("*****************");
		//2.for loop
		for(int j= 0; j<=10; j++) {
			System.out.println(j);
		}
		
		//print 10 to -10
		for(int k = 10; k>=-10; k--) {
			System.out.println(k);
		}
	}

}
