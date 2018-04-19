package myTraining;

abstract class Bike3{
	Bike3(){
		System.out.println("Bike is created.");
	}
	abstract void run();
	void changeGear(){
		System.out.println("Gear changed");
	}
}

class Honda1 extends Bike3{
	void run(){
		System.out.println("Bike is running safely...");
	}
}

// Rule: If there is any abstract method in a class, that class must be abstract.

// Rule: If you are extending any abstract class that have abstract method, 
// you must either provide the implementation of the method or make this class abstract.



public class TestAbstraction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike3 obj = new Honda1();
		obj.run();
		obj.changeGear();
	}
}
