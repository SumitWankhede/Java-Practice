package myTraining;

interface Bank2{
	float rateOfInterest();
}

class SBI1 implements Bank2{
	public float rateOfInterest(){
		return 7f;
	}
}

class PNB implements Bank2{
	public float rateOfInterest(){
		return 6.5f;
	}
}

public class TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank2 inf = new PNB();
		float roi = inf.rateOfInterest();
		System.out.println(roi);
	}

}
