package myTraining;

abstract class Bike2{						// Abstract class
	abstract void run();					// Abstract method
}

class Honda extends Bike2{
	void run(){
		System.out.println("running safely...");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike2 obj = new Honda();
		obj.run();
	}

}
