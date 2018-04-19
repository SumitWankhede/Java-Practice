package myTraining;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{	
			FileInputStream fin = new FileInputStream("D:\\Sumit\\Java\\myProject\\myTraining\\data\\data.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int i;
			
			while((i=bin.read()) != -1){
				System.out.print((char)i);
			}
			
			bin.close();
			fin.close();
			
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
