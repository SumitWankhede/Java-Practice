package array;













//demonstrates ordered array class
class OrdArray{
	private long[] a;									// ref to array a
	private int nElems;									// number of data items
	
	//---------------------------------------------------------------------------
	public OrdArray(int max){							// constructor
		a = new long[max];								// initialize array
		nElems = 0;
	}
	//---------------------------------------------------------------------------
	public int size(){
		return nElems;
	}
	//---------------------------------------------------------------------------
	public int find(long searchKey){
		int lowerBound = 0;
		int higherBound = nElems - 1;
		int curIn;
		
		while(true){
			curIn = (lowerBound + higherBound)/2;
			
			if(a[curIn] == searchKey)
				return curIn;								// found it
			else if (lowerBound > higherBound)
				return nElems;								// can't find it
			else{
				if(a[curIn] < searchKey)					// Divide range
					lowerBound = curIn + 1;					// Its in upper half
				else
					higherBound = curIn - 1;				// its in lower half
			}												// end else divide range
		}													// end while
	}														// end find()
	//------------------------------------------------------------------------------
	public void insert(long value){							// put element into array
		int j;
		for(j = 0; j < nElems; j++){						// find where it goes
			if(a[j] > value)								// (Linear search)
				break;
		}
		for(int k = nElems; k > j; k--){					// Move bigger ones up
			a[k] = a[k-1];
		}
		a[j] = value;										// insert it
		nElems++;											// increment size;
	}				//END INSERT
	//-------------------------------------------------------------------------------
	public boolean delete(long value){
		int j = find(value);
		if(j == nElems)										// Can't find it
			return false;
		else{												// found it
			for(int k = j; k < nElems; k++)					// move bigger ones down
				a[k] = a[k+1];
			nElems--;
			return true;
		}
	}				// End Delete()
	//--------------------------------------------------------------------------------
	public void display(){									// display array contents
		for(int i = 0; i < nElems; i++)						// for each element
			System.out.print(a[i] + " ");
		System.out.println("");
	}				// End Display()
	//--------------------------------------------------------------------------------
}					// End class OrdArray

//////////////////////////////////////////////////////////////////////////////////////

public class orderedArray {

	public static void main(String[] args) {
		int maxSize = 100;									// array size
		OrdArray arr = new OrdArray(maxSize);				// create the array
		
		// insert 10 items
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);

		int searchKey = 55;									// search for item 55
		
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);
		
		arr.display();										// display items
		
		arr.delete(00);										// delete 3 items
		arr.delete(55);
		arr.delete(99);
		
		arr.display();										//display item again
	} 					// End Main()
}						// End of class OrderedArray
