package myTraining;

class Animal5{
	void eat(){
		System.out.println("eating...");
	}
}

class Dog5 extends Animal5{
	void eat(){
		System.out.println("eating fruits...");
	}
}

class BabyDog5 extends Dog5{
	void eat(){
		System.out.println("drinking milk...");
	}
}

public class TestPolymorphism1 {

	public static void main(String[] args) {
		
		Animal5 obj;
		
		// Runtime polymorphism with multilevel inheritance
		obj = new Animal5();
		obj.eat();
		
		obj = new Dog5();
		obj.eat();
		
		obj = new BabyDog5();
		obj.eat();

	}

}
