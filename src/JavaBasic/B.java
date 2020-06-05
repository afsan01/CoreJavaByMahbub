package JavaBasic;

public class B extends A {

	public B() {
		super(10, 20);// super keywork is used for called for parent class constructor.
		System.out.println("child class cons");
	}

	public static void main(String args[]) {// to format the code press ctrl+shift+f
		B obj = new B();
	}
}
