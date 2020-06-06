package OOPSConnceptPart1;

public class Car {
	//Class vars:
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new car(); ---- this is the object of the Car class
		//new keyword is used to create the object
		//a,b,c --> Object reference variable
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel= 4;
		
		b.mod= 2016;
		b.wheel= 4;
		
		c.mod = 2017;
		c.wheel =4;
		
		System.out.println("before assign the refferences");
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println("after assign the refferences");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);
	}

}
