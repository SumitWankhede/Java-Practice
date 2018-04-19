package myTraining;

final class App{}
//
class Bike extends App{ // Error 3 due to final class, you cannot extend it 
	// Java Final method
	final void run(){System.out.println("running");}  
}

public class FinalKeywordApp extends Bike{

	// Final variable
	final int speedlimit=90;//final variable  
	void run(){  // Error2 due to final method
		speedlimit=400;	//Error1 due to final variable
		System.out.println("running safely with 100kmph");
	 }
	public static void main(String args[]){
		FinalKeywordApp obj = new FinalKeywordApp();
		obj.run();
	}
	
}
