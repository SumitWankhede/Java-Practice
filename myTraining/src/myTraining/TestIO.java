package myTraining;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi i am printing...");
		System.err.println("Hi i am error...");
		
		try{
		int i = System.in.read();
		System.out.println((char)i);
		}catch(IOException e){
			System.out.println(e);
		}		
	}
}
