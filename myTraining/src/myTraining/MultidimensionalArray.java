package myTraining;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][5];
		int i=1;
		// setting multidimensional array
		for(int x = 0; x<3; x++){
			for (int y = 0; y< 5; y++){
				arr[x][y] = i;
				i++;
			}
		}
		
		// using for each loop for multidimensional array
		for (int[] x: arr){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
