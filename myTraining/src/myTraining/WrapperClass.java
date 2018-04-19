package myTraining;

//	Primitive Type		Wrapper class
//	boolean				Boolean
//	char				Character
//	byte				Byte
//	short				Short
//	int					Integer
//	long				Long
//	float				Float
//	double				Double

public class WrapperClass {

	public static void main(String[] args) {
		// Converting int into Integer 
		int a = 20;
		Integer i = Integer.valueOf(a);//converting int into Integer 
		
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		System.out.println(a + " " + i + " " + j);
		
		//Converting Integer to int  
		Integer b = new Integer(3);
		
		int x = b.intValue(); //converting Integer to int 
		int y = b; //unboxing, now compiler will write a.intValue() internally   
		
		System.out.println(b + " " + x + " " + y);
	}

}
