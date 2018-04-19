package myTraining;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.method();
	}
}

class A{  
	int data=50;//instance variable  
	static int m=100;//static variable  
	void method(){  
	int n=90;//local variable
	System.out.println(n);
	}  
}//end of class  