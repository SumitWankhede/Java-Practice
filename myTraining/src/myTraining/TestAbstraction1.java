package myTraining;

abstract class Shape{
	abstract void draw();
}

class Rectangle1 extends Shape{
	void draw(){
		System.out.println("Rectangle drawn...");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle drawn...");
	}
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Circle();
		obj.draw();
	}

}
