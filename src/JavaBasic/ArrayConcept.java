package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {

		//array concept is similar datatype values in a array variable.
		//One dimentional array
		//dis-advantage of array:
		//1.size is fixed--static array
		//2. stores only similar data type---To overcome this problem we use Oblect array.
		
		//1. int array:
		int i[] = new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);

		//all the value of the value of the array
		for(int a=0; a<i.length; a++) {
			System.out.println(i[a]);
		}
		
		//2. double array:
		double d[] = new double [3];
		d[0] = 12.33;
		d[1] = 15.33;
		d[2] =45.55;
		
		System.out.println(d[2]);
	
	//3. char array:
		char c[]=new char[3];
		c[0]= 'a';
		c[1] = '1';
		c[2] = '$';
		
		//4 boolean array:
		boolean b[] = new boolean[2];
		b[0]= true;
		b[1] = false;
		
		//5. String array:
		String s[] = new String[3];
		s[0] ="test";
		s[1] = "Hello";
		s[2]= "World";
		
		System.out.println(s.length);
		
		//6.Object Array (Object Array
		Object ob[] = new Object[6] ;
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 15.25;
		ob[3] = "1/9/1995";
		ob[4] = 'M';
		ob[5] ="London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		

	
	
	
	
	}
	
}

