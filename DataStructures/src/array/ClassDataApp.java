package array;

class Person{
	private String lastName;
	private String firstName;
	private int age;
	//------------------------------------------------------------------------
	public Person(String last, String first, int a){		// Constructor
		lastName = last;
		firstName = first;
		age = a;
	}
	//------------------------------------------------------------------------
	public void display(){
		System.out.print(" Last name: " + lastName);
		System.out.print(" First name: " + firstName);
		System.out.println(" Age: " + age);
	}
	//------------------------------------------------------------------------
	public String getLast(){
		return lastName;									// Get last name
	}
}		// End of class
///////////////////////////////////////////////////////////////////////////////

class ClassDataArray{
	private Person[] a;										// reference array
	private int nElems;										// number of data items
	//-------------------------------------------------------------------------
	public ClassDataArray(int max){							// constructor
		a = new Person[max];								// initialize array
		nElems = 0;											// no values yet
	}
	//--------------------------------------------------------------------------
	public Person find(String searchName){
		int j;												// find specified value
		for (j = 0; j < nElems; j++){						// for each element
			if(a[j].getLast().equals(searchName))			// found item?
				break;										// exit loop before ends
		}
		if(j == nElems)										// gone to end ?
			return null;									// yes, can't find it
		else
			return a[j];									// no found it
	}
	//-----------------------------------------------------------------------------
	// put a person in array
	public void insert(String last, String first, int age){
		a[nElems] = new Person(last, first,age);
		nElems++;
	}
	//-----------------------------------------------------------------------------
	public boolean delete(String searchName){
		int j = 0;
		for (j=0; j<nElems; j++)
			if(a[j].getLast().equals(searchName))
				break;
		if(j == nElems)
			return false;
		else{
			for(int k = j; k<nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		}
	}
	//-----------------------------------------------------------------------------
	public void displayA(){
		for(int i=0; i<nElems; i++)
			a[i].display();
	}
	//-----------------------------------------------------------------------------
}		// End of class
///////////////////////////////////////////////////////////////////////////////////

public class ClassDataApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ClassDataArray arr;
		arr = new ClassDataArray(maxSize);
		
		arr.insert("Shah", "Sanket", 26);
		arr.insert("Biyani", "Aditya", 27);
		arr.insert("Bakhtar", "Sagar", 28);
		arr.insert("Shelke", "Jayant", 29);
		arr.insert("Mehta", "Sahil", 27);
		arr.insert("Shende", "Sagar", 25);
		
		arr.displayA();
		
		String searchKey = "Mehta";
		Person found;
		
		found = arr.find(searchKey);
		
		if(found != null){
			System.out.print(" Found: ");
			found.display();
		}
		else
			System.out.println(searchKey + " not found");
		
		arr.delete("Sagar");
		arr.delete("Biyani");
		
		arr.displayA();

	}
}
