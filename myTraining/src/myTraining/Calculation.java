package myTraining;

public class Calculation {
	
	void fact(int n){
		int fact = 1;
		for(int i = 1;i <= n; i++){
			fact = fact * i;
		}
		
		System.out.println("Factorial is: "+ fact);
	}
	
	public static void main(String[] args) {
		// calling method with anonymous object
		new Calculation().fact(5);
	}

}
