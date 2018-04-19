package array;

public class ArrayDeletion {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,7,4,5,6};
		int x = 3;
		boolean flag = false;
		
		for(int i = 0; i < arr.length-1 ; i++){
			if(arr[i] == x){
				
				flag = true;
			}
			if(flag == true){
				arr[i] = arr[i+1];
			}
		}
		
		System.out.println("Result:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}

}
