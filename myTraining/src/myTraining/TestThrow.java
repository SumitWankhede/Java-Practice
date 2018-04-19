package myTraining;

public class TestThrow {

	static void validate(int age){
		if(age < 18){
			throw new ArithmeticException("Age not valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(18);
		validate(13);
		System.out.println("Rest of the code...");
	}
}
