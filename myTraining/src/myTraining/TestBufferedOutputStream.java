package myTraining;

import java.io.FileOutputStream;
import java.io.*;

public class TestBufferedOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileOutputStream fout = new FileOutputStream("D:\\Sumit\\Java\\myProject\\myTraining\\data\\data.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String s = "Hey this is my mark XVIII";
		byte[] b = s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Operation completed!");
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
