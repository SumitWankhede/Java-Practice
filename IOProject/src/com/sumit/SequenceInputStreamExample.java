package com.sumit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * Created by Sumit on 27-Jul-17.
 */
public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException{
        FileInputStream fin1 = new FileInputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\1.txt");
        FileInputStream fin2 = new FileInputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\2.txt");

        FileOutputStream fout = new FileOutputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\3.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
        int i;

        while((i=sis.read()) != -1){
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();

    }
}
