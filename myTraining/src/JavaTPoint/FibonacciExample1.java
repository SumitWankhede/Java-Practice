package JavaTPoint;

public class FibonacciExample1 {

	public static void main(String[] args) {
		int i1 = 0, i2 = 1, i3;
		
		System.out.print(i1 + " " + i2);
		for(int i=0; i<10; i++){
			i3 = i2 + i1;
			i1 = i2;
			i2 = i3;
			System.out.print(" " + i3);
		}
	}
}
