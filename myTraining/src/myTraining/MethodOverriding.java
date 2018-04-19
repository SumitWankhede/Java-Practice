package myTraining;

class Example {
   void m1(){
      System.out.println("Example m1");
   }
   void m2(){
      System.out.println("Example m2");
      m1();
   }
}

public class MethodOverriding extends Example{

	void m1(){
      System.out.println("MethodOverriding m1");
	}
	
	public static void main(String[] args) {
		MethodOverriding s = new MethodOverriding();
	    s.m1();
	    s.m2();
	}

}
