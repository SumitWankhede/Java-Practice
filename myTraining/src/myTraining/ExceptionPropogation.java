package myTraining;

public class ExceptionPropogation {
	
	void m(){
		int i = 50/0;
	}
	
	void n(){
		m();
	}
	
	void p(){
		try{
			n();
		}catch(ArithmeticException e){
			System.out.println("Exception handled.");
		}
	}
	
	// Exception occurs in method m() where it is not handled, 
	// so it is propagated to previous method n() where it is not handled 	
	// again it is propagated to p() where it is handled
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropogation obj = new ExceptionPropogation();
		obj.p();
		System.out.println("Normal flow....");
	}

}
