package myTraining;

// Syntax for nested interface which is declared within the interface
//interface InterfaceOuter{
//	// ..... 
//	
//	interface InterfaceInner{
//		
//	}
//	
//	// .....
//}

// Syntax for nested interface which is declared within the class
//class ClassName{
//	// .....
//	
//	interface NestedInterface{
//		// .....
//	}
//	
//	// .....
//}

// Example of nested interface which is declared within the interface
interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

// Example of nested interface which is declared within the class
class A8{
	interface Message{
		void msg1();
	}
}

public class NestedInterface implements Showable.Message, A8.Message{
	
	public void msg(){
		System.out.println("Hello I am nested interface");
	}
	
	public void msg1(){
		System.out.println("Nested interface within class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable.Message inf = new NestedInterface();
		inf.msg();
		
		A8.Message inf1 = new NestedInterface();
		inf1.msg1();
	}

}
