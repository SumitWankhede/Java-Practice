package com.sumit;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Sumit on 27-Jul-17.
 */
public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\testout.txt");

            // read a char
            int i = fin.read();
            System.out.println((char)i);

            // read a string
            i=0;
            while((i=fin.read()) != -1){
                System.out.print((char)i);
            }

            fin.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
