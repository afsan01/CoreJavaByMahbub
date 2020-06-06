package OOPSConnceptPart1;

public class LocalVSGlobalVAriables {

	String name = "Tom";
	static int age = 25;
	
	public static void main(String[] args) {
		
		int i =10;
		LocalVSGlobalVAriables obj = new LocalVSGlobalVAriables();
		System.out.println(obj.name);
		System.out.println(age);
		sum();
	}
	public static void sum() {
		int i = 10;
		int j = 20;
		System.out.println(i*j);
	}
	

}
