package myTraining;

interface Printable{
	// Blank interface
}  

class A4 implements Printable{
	// 
	public void a(){
		System.out.println("a method");
	}  
}  

class B4 implements Printable{
	// 
	public void b(){
		System.out.println("b method");
	}  
}  
  
class Call{  
	void invoke(Printable p){//upcasting  
		if(p instanceof A4){  
			A4 a=(A4)p;//Downcasting   
			a.a();  
		}  
		if(p instanceof B4){  
			B4 b=(B4)p;//Downcasting   
			b.b();  
		}  
	}  
}//end of Call class

public class RealUseOfInstanceofOperator {

	public static void main(String[] args) {
		
		Printable p=new B4();  
		Call c=new Call();  
		c.invoke(p);
	}
}
