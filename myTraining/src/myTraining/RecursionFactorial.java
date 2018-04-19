package myTraining;

class Factorial{
	
	public int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return (n*fact(n-1));
		}
	}
}

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		
		System.out.println("Factorial is: " + obj.fact(5));
	}

}
