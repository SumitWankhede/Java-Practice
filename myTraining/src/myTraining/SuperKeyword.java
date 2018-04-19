package myTraining;

// Super for parent instance variable
class Animal{
	
	Animal(){
		System.out.println("Animal constructor!");
	}
	
	String color="white";  
	void eat(){System.out.println("eating...");}
}  

class Dog extends Animal{  
	
	String color="black";  	
	
	Dog(){
		super(); // super is used to invoke parent class constructor
		// super() is added in each class constructor automatically by compiler 
		//if there is no super() or this().
		//TRY AND COMMENT SUPER() RESULT WILL BE SAME.
		System.out.println("Dog constructor");
	}
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}
	
	void eat(){
		System.out.println("eating bread...");
	}  
	void bark(){
		System.out.println("barking...");
	}  
	void work(){  
		super.eat();  // Super to invoke parent method
		bark(); 
	}  
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d=new Dog();  
		d.printColor(); 
		d.work();
	}
}
