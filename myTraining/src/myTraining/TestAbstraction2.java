package myTraining;

abstract class Bank1{
	abstract void getRateOfInterest();
}

class ICIC extends Bank1{
	void getRateOfInterest(){
		System.out.println("Rate of Interest for ICICI is 5.7%");
	}
}

class SBII extends Bank1{
	void getRateOfInterest(){
		System.out.println("Rate of Interest for SBI is 6.2%");
	}
}

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 obj = new SBII();
		obj.getRateOfInterest();
	}

}
