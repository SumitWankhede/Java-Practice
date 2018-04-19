package myTraining;

// Q) Multiple inheritance is not supported through class in java but it is possible 
// by interface, why?

// Answer: As we have explained in the inheritance chapter, 
// multiple inheritance is not supported in case of class because of ambiguity. 
// But it is supported in case of interface because there is no ambiguity as 
// implementation is provided by the implementation class. For example:

interface Printable2{
	void print();
}

interface Showable2{
	void print();
}

public class MultipleInheritance1 implements Printable2, Showable2 {
	
	public void print(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance1 obj  = new MultipleInheritance1();
		obj.print();
	}

}
