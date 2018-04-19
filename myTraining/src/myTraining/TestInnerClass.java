package myTraining;

class MemberOuter{
	private int data = 30;
	
	// Member Inner class
	class Inner{
		void msg(){
			System.out.println("Data is " + data);
		}
	}
}

abstract class Person1{  
	  abstract void eat();  
} 

interface Eatable{
	void eat();
}

// Local inner class
class localInner{
	
	private int i = 90;
	
	void display(){
		
		// Local inner class
		class local{
			void msg(){
				System.out.println(i);
			}
		}
		
		local obj = new local();
		obj.msg();
	}
}

// Static nested class
class TestOuter1{
	static int data = 30;
	static class Inner{
		void msg(){
			System.out.println("data is : " + data);
		}
		static void display(){
			System.out.println("This is static method");
		}
	}
}

public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOuter obj = new MemberOuter();
		MemberOuter.Inner in = obj.new Inner();
		in.msg();
		
		// Anonymous inner class for abstract class
		Person1 obj1 = new Person1(){
			void eat(){
				System.out.println("nice fruits");
			}
		};
		obj1.eat();
		
		// Anonymous inner class for interface
		Eatable e = new Eatable(){
			public void eat(){
				System.out.println("nice fruits");
			}
		};
		e.eat();
		
		// Local inner class
		localInner obj2 = new localInner();
		obj2.display();
		
		// static nested class
		TestOuter1.Inner obj3 = new TestOuter1.Inner();
		obj3.msg();
		
		//static nested class example with static method
		TestOuter1.Inner.display();
	}
}
