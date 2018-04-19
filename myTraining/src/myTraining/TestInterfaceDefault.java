package myTraining;

// Since Java 8, we can have method body in interface. 
// But we need to make it default method. Let's see an example:

interface Drawable4{
	void draw();
	default void msg(){
		System.out.println("default method");
	}
}

class Rectangle4 implements Drawable4{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle4 obj = new Rectangle4();
		obj.draw();
		obj.msg();
	}

}
