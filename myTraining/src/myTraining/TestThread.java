package myTraining;

class Multi implements Runnable{
	public void run(){
		System.out.println("Thread is running via implementing Runnable interface...");
	}
}

public class TestThread extends Thread{
	
	public void run(){
		System.out.println("Thread is running via extending Thread class...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread obj = new TestThread();
		obj.start();
		
		Multi obj1 = new Multi();
		Thread t1 = new Thread(obj1);
		t1.start();
	}

}
