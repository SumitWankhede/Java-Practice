package myTraining;

import java.io.IOException;

class M{
	void method() throws IOException{
		throw new IOException("Device error.");
	}
}

public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new M();
		try{
			m.method();
		}catch(IOException e){
			System.out.println("Exception handled");
		}
		System.out.println("rest of code");
	}

}
