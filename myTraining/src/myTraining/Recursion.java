package myTraining;

class RecursionExample{
	static int count = 0;
	
	static void p(){
		count++;
		if(count < 6){
			System.out.println("Hello " + count);
			p();
		}
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExample x = new RecursionExample();
		x.p();
	}

}
