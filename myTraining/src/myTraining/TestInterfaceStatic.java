package myTraining;

// Since Java 8, we can have static method in interface. Let's see an example:
interface Drawable5{
	void draw();
	static int cube(int x){
		return x*x*x;
	}
}

class Rectangle5 implements Drawable5{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}

public class TestInterfaceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle5 obj = new Rectangle5();
		obj.draw();
		System.out.println("Cube of 5 is: "+ Drawable5.cube(5));
	}

}
