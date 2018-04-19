package myTraining;

class Animal1{
	void eat(){
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1{
	void eat(){
		System.out.println("eating fruit");
	}
}

class BabyDog extends Dog1{
	void eat(){
		System.out.println("driking milk");
	}
}

class BabyDog1 extends Dog1{
	
}

public class AnimalMultilevelRuntimePolymorphism {

	public static void main(String[] args) {
		
		Animal1 a1,a2,a3,a4;  
		a1=new Animal1();  
		a2=new Dog1();  
		a3=new BabyDog();
		a4=new BabyDog1();
		a1.eat();  
		a2.eat();  
		a3.eat();  
		//Since, BabyDog1 is not overriding the eat() method, so eat() method of Dog class is invoked.
		a4.eat();
	}

}
