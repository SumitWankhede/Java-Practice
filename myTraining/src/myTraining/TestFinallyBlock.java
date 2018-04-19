package myTraining;

public class TestFinallyBlock {

	public static void main(String[] args) {
		// Case 1: When exception doesn't occur.
		try{
			int data = 25/5;
			System.out.println(data);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block always executed");
		}
		
		// Case 2: When exception occurs but not handled
		try{
			int bata = 25/0;
			System.out.println(bata);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally block is executing");
		}
		
		// Case 3: Exception occurs and handled
		try{
			int aata = 25/0;
			System.out.println(aata);
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally{
			System.out.println("Finally block is executed");
		}
		
		System.out.println("rest of code");
	}
}
