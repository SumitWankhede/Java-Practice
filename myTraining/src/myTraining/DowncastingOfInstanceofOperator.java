package myTraining;

class Animal2 {

}

class Dog2 extends Animal2 {

}

// Downcasting possible
class Dog3 extends Animal2 {
	static void method(Animal2 a) {
		if (a instanceof Dog3) {
			Dog3 d = (Dog3) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}
}

class Dog4 extends Animal2 {  
	  static void method(Animal2 a) {  
	       Dog4 d=(Dog4)a;//downcasting  
	       System.out.println("ok downcasting performed");  
	  }  
}

public class DowncastingOfInstanceofOperator {

	public static void main(String[] args) {
		// Compilation error
		// Downcasting not allowed
		// Dog2 d = new Animal2();

		// Compiles successfully but ClassCastException is thrown at runtime
		// Dog2 d = (Dog2)new Animal2();

		// Possibility of downcasting with instanceof
		Animal2 a = new Dog3();
		Dog3.method(a);
		
		//Downcasting without the use of java instanceof
		Animal2 a1=new Dog4();  
	    Dog4.method(a1);
	    
	    
	    Animal2 a2 = new Animal2();
	    //Now ClassCastException but not in case of instanceof operator
	    Dog4.method(a2);
	    //Now in case of instanceof operator it will not throw error
		Dog3.method(a2);
	}
}
