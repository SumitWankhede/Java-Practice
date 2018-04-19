package array;

class highArray{
	private int[] arr;
	private int nElems;
	
	public highArray(int size){
		arr = new int[size];
		nElems = 0;
	}
	
	public void insert(int value){
		arr[nElems] = value;
		nElems++;
	}
	
	// Linear Search
	public boolean find(int searchKey){
		int j = 0;
		for(j = 0; j < nElems; j++){
			if(arr[j] == searchKey)
				break;
		}
		if(j == nElems)
			return false;
		else
			return true;
	}
	
	// Binary search
	/*public int findB(int searchKey){
		int lowerBound = 0;
		int higherBound= nElems - 1;
		int curIn;
		
		while(true){
			curIn = (lowerBound + higherBound) / 2;
			
			if(arr[curIn] == searchKey)
				return curIn;
			else if(lowerBound > higherBound)
				return 0;
			else{
				if(arr[curIn] < searchKey)
					higherBound = curIn + 1;
				else
					lowerBound = curIn - 1;
			}
		}
	}*/
	
	public boolean delete(int value){
		int j;
		for(j = 0; j < nElems; j++){
			if(arr[j] == value)
				break;
		}
		if(j == nElems)
			return false;
		else{
			for(int k = j; k < nElems; k++)
				arr[k] = arr[k + 1];
			nElems--;
			return true;
		}
	}
	
	public void display(){
		for(int j = 0; j < nElems; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}

public class highArrayApp {

	public static void main(String[] args) {
		int maxSize = 100;
		highArray arr;
		arr = new highArray(maxSize);
		
		arr.insert(77);
		arr.insert(76);
		arr.insert(75);
		arr.insert(74);
		arr.insert(73);
		arr.insert(72);
		arr.insert(71);
		
		arr.display();
		
		int searchKey = 75;
		if(arr.find(searchKey)){
			System.out.println("Value found :" + searchKey);
		}
		else{
			System.out.println("Cant find value for : " + searchKey);
		}
		
		/*if(arr.findB(searchKey) == 0){
			System.out.println("Cant find value for : " + searchKey);
		}
		else{
			System.out.println("Value found :" + searchKey);
		}*/
		
		arr.delete(72);
		arr.delete(75);
		
		arr.display();

	}

}
