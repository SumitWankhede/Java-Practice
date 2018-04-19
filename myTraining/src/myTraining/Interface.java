package myTraining;

// The java compiler adds public and abstract keywords before the interface method. 
// More, it adds public, static and final keywords before data members

// Before
// interface Printable{
// int MIN = 5;
// void print();
// }

// After compiler
// interface Printable{
// public static final int MIN = 5;
// public abstract void print();
// }

// Understanding relationship between classes and interfaces
// i] class extends class
// ii] interface extends interface
// iii] but class implements an interface

interface printable{
	void print();
}

class A6 implements printable{
	public void print(){
		System.out.println("Hello");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 obj = new A6();
		obj.print();
	}

}
