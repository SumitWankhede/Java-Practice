package myTraining;

interface D{
	void a();
	void b();
	void c();
	void d();
}

abstract class E implements D{
	public void c(){
		System.out.println("This is C");
	}
}

class F extends E{
	public void a(){
		System.out.println("This is A");
	}
	public void b(){
		System.out.println("This is B");
	}
	public void d(){
		System.out.println("This is D");
	}
}

public class AbstractAndInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D inf = new F();
		inf.a();
		inf.b();
		inf.c();
		inf.d();
		
	}

}
