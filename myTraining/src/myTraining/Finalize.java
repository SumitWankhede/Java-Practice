package myTraining;

public class Finalize {

	public void finalize(){
		System.out.println("Finalize called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize f1 = new Finalize();
		Finalize f2 = new Finalize();
		
		f1 = null;
		f2 = null;
		
		System.gc();
	}

}
