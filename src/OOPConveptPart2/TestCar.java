package OOPConveptPart2;

public class TestCar {

	public static void main(String[] args) {

		//static polymorphysm-- compile-time- polymorphysm
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("***********");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("***********");
		
		//Top casting
		Car c1 = new BMW(); //child class object can be reffered by parent class reference variable
		                    //called --dynamic polymorphysm or Run time polymorphysm,
		c1.start();
		c1.stop();
		c1.refuel();
		
	}

}
