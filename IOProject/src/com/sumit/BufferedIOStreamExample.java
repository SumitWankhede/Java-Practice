package com.sumit;

import java.io.*;

/**
 * Created by Sumit on 27-Jul-17.
 */
public class BufferedIOStreamExample {

    public static void main(String[] args) throws IOException{
        FileOutputStream fout = new FileOutputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\testout.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fout);

        String s = "YouTube rocks....";

        byte b[] = s.getBytes();

        bos.write(b);
        bos.flush();
        bos.close();
        fout.close();

        try {
            FileInputStream fin = new FileInputStream("D:\\Sumit\\Java\\CJM\\IOProject\\data\\testout.txt");
            BufferedInputStream bis = new BufferedInputStream(fin);

            int i;

            while((i=fin.read()) != -1){
                System.out.print((char)i);
            }
            bis.close();
            fin.close();
        }catch (IOException ex){
            System.out.println(ex);
        }

        System.out.println("Success.... ");
    }

}
