package com.sumit;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sumit on 26-Jul-17.
 */
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\testout.txt");

            // write byte
            fout.write(65);

            // write string
            String str = "Wrecking ball";
            byte b[] = str.getBytes();
            fout.write(b);

            fout.close();
            System.out.println("Success...");
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
