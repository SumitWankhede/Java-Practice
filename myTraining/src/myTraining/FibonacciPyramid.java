package myTraining;

public class FibonacciPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		a[0] = 0;
		a[1] = 1;
		for(int i = 1;i < 10; i++){
			for(int j = 0; j < i; j++){
				System.out.print(a[j]);
			}
			System.out.println();
			if(i<9){
				a[i+1] = a[i] + a[i-1];
			}
		}
	}

}
