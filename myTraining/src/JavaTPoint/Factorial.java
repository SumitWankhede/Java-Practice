package JavaTPoint;

public class Factorial {

	public static void main(String[] args) {
		int n = 5; // Input
		
		CheckFactorial(n);
		
	}

	private static void CheckFactorial(int n) {
		int result = 1;
		int temp = n;
		while(temp>0){
			result *= temp;
			temp--;
		}
		
		System.out.println("Factorial of " + n + " is: " + result);
	}

}
