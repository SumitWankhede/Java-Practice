package array;

// lowArray.java
// demonstrates array class with low-level interface
/////////////////////////////////////////////////////////////
class LowArr{
	private int[] a; 			// ref to array a
	//------------------------------------------------------
	public LowArr(int size){		// constructor
		a = new int[size];			// initialize array
	}
	//-------------------------------------------------------
	public void setElem(int index, int value){
		a[index] = value;		// set value
	}
	public int getElem(int index){
		return a[index];		// get value
	}
}
///////////////////////////////////////////////////////////////////

public class lowArray {

	public static void main(String[] args) {
		LowArr arr;							// reference 
		arr = new LowArr(10);					// create LowArray object
		int nElems = 10;							// number of items in array
		int j;									// loop variable
		
		// insertion
		arr.setElem(0, 11);
		arr.setElem(1, 22);
		arr.setElem(2, 33);
		arr.setElem(3, 44);
		arr.setElem(4, 55);
		arr.setElem(5, 66);
		arr.setElem(6, 77);
		arr.setElem(7, 88);
		arr.setElem(8, 99);
		arr.setElem(9, 34);
		
		// print
		for(j = 0; j < nElems; j++){
			System.out.print(arr.getElem(j)+" ");
		}
		System.out.println("");
		
		int searchKey = 26;						// search for data item
		for(j=0; j < nElems; j++){				// for each element,
			if(arr.getElem(j) == searchKey)		// found item?
				break;
		}
		if(j == nElems)							// no
			System.out.println("Can't find " + searchKey);
		else
			System.out.println("Found " + searchKey);
		
		// Delete value 55
		for(j=0; j < nElems; j++)				// Look for it
			if(arr.getElem(j) == 55)
				break;
		
		for(int k = j; k < nElems-1; k++)
			arr.setElem(k, arr.getElem(k+1));
		nElems--;
		
		for(j=0; j<nElems; j++){
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println(" ");
	}
}
