package myTraining;

class Bank{
	float getRateOfInterest(){
		return 0;
	}
}

class SBI extends Bank{
	float getRateOfInterest(){
		return 8.4f;
	}
}

class ICICI extends Bank{
	float getRateOfInterest(){
		return 7.6f;
	}
}

class HDFC extends Bank{
	float getRateOfInterest(){
		return 9.3f;
	}
}

public class BankRuntimePolymorphism {

	public static void main(String[] args) {

		Bank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new HDFC();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 

	}

}
