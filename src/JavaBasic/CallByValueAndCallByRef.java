package JavaBasic;

public class CallByValueAndCallByRef {

	int p;
	int q;
	public static void main(String[] args) {

		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x= 20;
		int y = 30;
		obj.testSum(x, y);//call by value or pass by value
		
		obj.p =50;
		obj.q =60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	/*public int testSum(int a, int b) {
		a= 10;
		b= 40;
		int c= a+b;
		return c;
	}*/
	public void testSum(int a, int b) {

		System.out.println(a+b);
	}
	//call by reference
	public void swap (CallByValueAndCallByRef t) {
		int temp;
		temp=t.p;//temp=50
		t.p = t.q; //p=60
		t.q = temp; //q=50
		//System.out.println(t.p+t.q);
		
	}

}
