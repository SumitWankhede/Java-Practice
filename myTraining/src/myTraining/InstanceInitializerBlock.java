package myTraining;

class Bike7{  
    int speed;  
      
    Bike7(){
    	System.out.println("constructor is invoked");
    }  
   
    // Example of instance initializer block
    // The java compiler copies the code of instance initializer block in every constructor.
    {
    	System.out.println("instance initializer block invoked");
    }  
}

/* Rules for instance initializer block :
There are mainly three rules for the instance initializer block. They are as follows:
	The instance initializer block is created when instance of the class is created.
	The instance initializer block is invoked after the parent class constructor is invoked
	 (i.e. after super() constructor call).
	The instance initializer block comes in the order in which they appear.
*/


// instance initializer block that is invoked after super()
class A2{  
	A2(){  
		System.out.println("parent class constructor invoked");  
	}  
}  
class B2 extends A2{  
	B2(){  
		super();  
		System.out.println("child class constructor invoked");  
	}  
	  
	{
		System.out.println("instance initializer block is invoked");
	}  
}

class B3 extends A2{  
	B3(){  
		super();  
		System.out.println("child class constructor invoked");  
	}  
  
	B3(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  
	  
	{
		System.out.println("instance initializer block is invoked");
	}  
}

public class InstanceInitializerBlock {

	public static void main(String[] args) {
		Bike7 b1=new Bike7();  
	    Bike7 b2=new Bike7(); 
	    // Instance initializer block that is invoked after super()
	    System.out.println("");
	    B2 b=new B2(); 
	    System.out.println("");
	    // Instance initializer block that is invoked after super() for parameterized constructor
	    B3 b3=new B3();  
	    B3 b4=new B3(10); 
	}
}
