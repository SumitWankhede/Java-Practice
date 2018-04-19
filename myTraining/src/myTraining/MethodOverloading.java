package myTraining;

// If a class has multiple methods having same name but different in parameters,
// it is known as Method Overloading.

// Advantage of method overloading
// Method overloading increases the readability of the program.

// There are two ways to overload the method in java
// By changing number of arguments
// By changing the data type

class Adder {
	//overloading by changing number of arguments
	int sum(int a, int b){
		return a + b;
	}
	int sum(int a, int b, int c){
		return a + b + c;
	}
	
	
	// overloading by changing data types
	int add(int a, int b){
		return a + b;
	}
	float add(float a, float b){
		return a + b;
	}
}


/*Can we overload java main() method?
Yes, by method overloading. You can have any number of main methods 
in a class by method overloading. But JVM calls main() method which 
receives string array as arguments only. Let's see the simple example:

class TestOverloading4{  
	public static void main(String[] args){
		System.out.println("main with String[]");
	}  
	public static void main(String args){
		System.out.println("main with String");
	}  
	public static void main(){
		System.out.println("main without args");
	}  
}

Output: main with String[]
*/


public class MethodOverloading {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.sum(5, 8));
		System.out.println(a.sum(7, 4, 9));
		
		System.out.println(a.add(5, 8));
		System.out.println(a.add(2.1f, 9.6f));
	}
}
