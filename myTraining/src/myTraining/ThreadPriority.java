package myTraining;

class TestMultiPriority extends Thread{
	public void run(){
		System.out.println("running thread name is: " + Thread.currentThread().getName());
		System.out.println("priority of running thread is: " + Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiPriority obj1 = new TestMultiPriority();
		TestMultiPriority obj2 = new TestMultiPriority();
		TestMultiPriority obj3 = new TestMultiPriority();
		
		obj1.setName("Soloman Kane");
		obj1.setPriority(Thread.MIN_PRIORITY);
		
		obj2.setName("Van Helsing");
		obj2.setPriority(Thread.MAX_PRIORITY);
		
		obj3.setName("Bruce Wayne");
		obj3.setPriority(Thread.NORM_PRIORITY);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
