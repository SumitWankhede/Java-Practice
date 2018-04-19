package myTraining;

import java.io.IOException;

// Rules:
// 1) Rule: If the superclass method does not declare an exception, 
//          subclass overridden method cannot declare the checked exception.

class Parent1{  
	void msg(){
		System.out.println("parent");
	}  
} 

// Rule 1:
//class Child extends Parent{
//	void msg() throws IOException{   // Gives compile time error
//		System.out.println("Test Exception Child");
//	}
//}

// 2) Rule: If the superclass method does not declare an exception,
//          subclass overridden method cannot declare the checked exception 
//          but can declare unchecked exception.

class Child extends Parent1{  
	  void msg()throws ArithmeticException{  
	    System.out.println("child");  
	  }
}


// 3) Rule: If the superclass method declares an exception, 
//          subclass overridden method can declare same, 
//          subclass exception or no exception but cannot declare parent exception.
class Parent2{  
	  void msg()throws ArithmeticException{
		  System.out.println("parent");
	  }  
} 

// Rule 3:
//class TestExceptionChild2 extends Parent1{  
//	  void msg()throws Exception{		// Compile time error
//		  System.out.println("child");
//	  }  
//}

public class ExceptionHandlingWithMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
