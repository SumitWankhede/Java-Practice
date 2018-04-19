package myTraining;

// Program of counter without static variable
class Counter1{  
	int count=0;//will get memory when instance is created  
	  
	Counter1(){  
		count++;  
		System.out.println(count);  
	}
}

//Program of counter with static variable
class Counter2{  
	static int count=0;//will get memory only once and retain its value  
	  
	Counter2(){  
		count++;  
		System.out.println(count);  
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counter without static variable");
		Counter1 c1=new Counter1();  
		Counter1 c2=new Counter1();  
		Counter1 c3=new Counter1();
		
		System.out.println("Counter with static variable");
		Counter2 c4=new Counter2();  
		Counter2 c5=new Counter2();  
		Counter2 c6=new Counter2();
	}

}
