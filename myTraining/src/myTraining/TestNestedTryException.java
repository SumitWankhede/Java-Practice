package myTraining;

public class TestNestedTryException {

	public static void main(String[] args) {
		try{
			
			try{
				System.out.println("Going to devide");
				int a = 39/0;
			}catch(ArithmeticException e){
				System.out.println(e);
			}
			
			try{
				int a[] = new int[5];
				a[5] = 4;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			
			System.out.println("Other statement");
			
		}catch(Exception e){
			System.out.println("handled");
		}
		
		System.out.println("normal flow....");
	}
}
