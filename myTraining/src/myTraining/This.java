package myTraining;

//Without This keyboard
class Student4{  
	int rollno;  
	String name;  
	float fee;  
	
	Student4(int rollno,String name,float fee){  
		rollno=rollno;  
		name=name;  
		fee=fee;  
	}
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}

//With This keyboard
//parameters (formal arguments) and instance variables are same. 
//So, we are using this keyword to distinguish local variable and instance variable.
class Student5{  
	int rollno;  
	String name;  
	float fee;  
	
	Student5(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}

// this: to invoke current class method
class A1{  
	void m(){
		System.out.println("hello m");
	}  
	void n(){  
		System.out.println("hello n");  
		//m();
		//same as this.m()  
		this.m();  
	}  
}  

// this() : to invoke current class constructor
// The this() constructor call can be used to invoke the current class constructor.
//It is used to reuse the constructor. 
//In other words, it is used for constructor chaining.
class B{  
	B(){
		System.out.println("hello a");
	}  
	B(int x){  
		this();  
		System.out.println(x);  
	}  
}
	
//Calling parameterized constructor from default constructor:
class C{  
	C(){  
		this(5);  
		System.out.println("hello a");  
	}  
	C(int x){  
		System.out.println(x);  
	}  
} 


public class This {

	public static void main(String[] args) {
		// Without This keyword
		Student4 s1=new Student4(111,"ankit",5000f);  
		Student4 s2=new Student4(112,"sumit",6000f);  
		s1.display();  
		s2.display();
		
		// With This keyboard
		Student5 s3=new Student5(111,"ankit",5000f);  
		Student5 s4=new Student5(112,"sumit",6000f);  
		s3.display();  
		s4.display();
		
		// invoke method using this
		A1 a=new A1();  
		a.n();
		
		// invoke current class constructor
		B b=new B(10);
		
		// Calling parameterized constructor from default constructor:
		C c = new C();
	}
}
