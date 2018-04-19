package myTraining;

class Bank{
	float getRateOfInterest(){
		return 0;
	}
}

class SBI2 extends Bank{
	float getRateOfInterest(){
		return 4.6f;
	}
}

class AXIS extends Bank{
	float getRateOfInterest(){
		return 8.2f;
	}
}

class CITI extends Bank{
	float getRateOfInterest(){
		return 9.1f;
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		Bank obj;
		
		obj = new SBI2();
		System.out.println("Rate of Interest of SBI: " + obj.getRateOfInterest());
		
		obj = new AXIS();
		System.out.println("Rate of interest of AXIS: " + obj.getRateOfInterest());
		
		obj = new CITI();
		System.out.println("Rate of interest of ICICI: " + obj.getRateOfInterest());
	}
}
