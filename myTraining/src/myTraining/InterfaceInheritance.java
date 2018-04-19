package myTraining;

interface Printable3{
	void print();
}

interface Showable3 extends Printable3{
	void show();
}

public class InterfaceInheritance implements Showable3{

	public void print(){
		System.out.println("Hello");
	}
	
	public void show(){
		System.out.println("World");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInheritance obj = new InterfaceInheritance();
		obj.print();
		obj.show();
	}

}
