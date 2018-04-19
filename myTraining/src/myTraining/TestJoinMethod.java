package myTraining;

class JoinMethod extends Thread{
	public void run(){
		for(int i = 0; i < 5; i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
}

class TestJoinMethod1 extends Thread{  
	 public void run(){  
		 System.out.println(Thread.currentThread().getName());  
	 }	 
} 

public class TestJoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethod obj1 = new JoinMethod();
		JoinMethod obj2 = new JoinMethod();
		JoinMethod obj3 = new JoinMethod();
		JoinMethod obj4 = new JoinMethod();
		
		obj1.start();
		try{
			obj1.join();
		}catch(Exception e){
			System.out.println(e);
		}
		
		obj2.start();
		obj3.start();
		obj4.start();
		
		// setName method
		obj1.setName("Mark Ruffalo");
		// getName method
		System.out.println("After changing name of obj1: " + obj1.getName());
		
		// currentThread
		TestJoinMethod1 obj5 = new TestJoinMethod1();
		TestJoinMethod1 obj6 = new TestJoinMethod1();
		obj5.start();
		obj6.start();
	}
}

