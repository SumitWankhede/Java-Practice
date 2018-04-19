package myTraining;

interface Printable1{
	void print();
}

interface Showable1{
	void show();
}

// If a class implements multiple interfaces, or an interface extends multiple interfaces
// i.e. known as multiple inheritance.

class A7 implements Printable1, Showable1{
	public void print(){
		System.out.println("Hello");
	}
	public void show(){
		System.out.println("World");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

}
