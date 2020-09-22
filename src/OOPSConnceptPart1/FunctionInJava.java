package OOPSConnceptPart1;

public class FunctionInJava {

	public static void main(String[] args) {

		// no-static metod
		FunctionInJava obj = new FunctionInJava();
		int l=obj.test1();
		System.out.println(l);
		double d1=obj.division(125, 10);
		System.out.println(d1);
		String s1=obj.qa();
		System.out.println(s1);
		
	}

	public void test() { //no input, no output
		System.out.println("test method");
	}
	
	public int test1() {//no input, some output
		System.out.println("test1 method");
		int a= 10;
		int b =20;
		int c = a+b;
		return c;
	}
	
	public String qa() { //no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	public double division(double x, double y) { //some input, some output
		System.out.println("division method");
		double d =x/y;
		return d;
	}

}
