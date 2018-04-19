package JavaTPoint;

public class CheckPrime {

	public static void main(String[] args) {
		int n = 17; // input number
		int m,flag = 0;
		if(n > 1){
			m=n/2;
			for(int i = 2; i <= m; i++){
				if(n%i==0){
					System.out.println(n + " is not a prime number");
					flag = 1;
				}
			}
			if(flag == 0){
				System.out.println(n + " is a prime number");
			}
		}
		else{
			System.out.println("Number is invalid");
		}
	}

}
