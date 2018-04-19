package myTraining;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

public class CustomException {

	static void validate(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("Age Not Valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(13);
		}catch(Exception m){
			System.out.println("Excetion occured: " + m);
		}
		
		System.out.println("Rest of the code");
	}
}
