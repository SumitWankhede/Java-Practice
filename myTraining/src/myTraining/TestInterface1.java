package myTraining;

// Interface declaration: by first user
interface Drawable{
	void draw();
}

// Implementation: by second user
class Rectangle2 implements Drawable{
	public void draw(){
		System.out.println("Rectangle drawn.");
	}
}

class Circle1 implements Drawable{
	public void draw(){
		System.out.println("Circle drawn.");
	}
}

// Using interface: by third user
public class TestInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Circle1();				//	In real scenario, object is provided by method
		d.draw();
	}

}
