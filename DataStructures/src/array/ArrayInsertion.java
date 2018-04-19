package array;

public class ArrayInsertion {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 8, 0};
		int pos = 4, x = 4, n = arr.length-1;
		int i = 0;
		
		int[] a = {1,2,3,4};
		int[] b = new int[a.length-1];
		
		System.out.println("Length a:" + a.length);
		System.out.println("Length b:" + b.length);
		
		b = a;
		
		System.out.println("Length a:" + a.length);
		System.out.println("Length b:" + b.length);
		
		System.out.println("Original array:");
		for(i = 0;i < n; i++){
			System.out.print(arr[i]+ ", ");
		}
		
		System.out.println();
		
		for( i = (n-1); i >= (pos - 1); i--){
			arr[i+1] = arr[i];
		}
		arr[pos - 1] = x;
		
		System.out.println("Array after insertion:");
		for(i = 0; i <= n; i++){
			System.out.print(arr[i]+", ");
		}
	}
}
