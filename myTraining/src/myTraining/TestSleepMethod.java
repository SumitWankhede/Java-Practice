package myTraining;

class SleepMethod extends Thread{
	public void run(){
		for(int i = 0; i<500; i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			
			System.out.println(i);
		}
	}
}

public class TestSleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod obj1 = new SleepMethod();
		SleepMethod obj2 = new SleepMethod();
		
		obj1.start();
		obj2.start();
	}

}
