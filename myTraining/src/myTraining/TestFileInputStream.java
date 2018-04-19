package myTraining;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fin = new FileInputStream("D:\\Sumit\\Java\\myProject\\myTraining\\data\\data.txt");
			int i = fin.read();
			System.out.println((char)i);
			
			i = 0;
			while((i=fin.read())!= -1){
				System.out.print((char)i);
			}
			
			fin.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
