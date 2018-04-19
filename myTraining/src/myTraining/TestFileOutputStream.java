package myTraining;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream fout = new FileOutputStream("D:\\Sumit\\Java\\myProject\\myTraining\\data\\data.txt");
			
			fout.write(65); // ASCII value of A
			
			String s = "Yeey! I can write in the file!";
			byte[] b = s.getBytes();
			fout.write(b);
			
			fout.close();
			System.out.println("Operation completed!");
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
