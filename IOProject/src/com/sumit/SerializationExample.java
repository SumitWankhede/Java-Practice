package com.sumit;

import java.io.*;

/**
 * Created by Sumit on 28-Jul-17.
 */
public class SerializationExample {

    public static void main(String[] args) {

        // Serialization
        Student s1 = new Student(303, "Sumit");
        try {
            FileOutputStream fout = new FileOutputStream("D:\\test.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);

            out.flush();
            out.close();
            fout.close();

            System.out.println("Success 1....");

        }catch(IOException ex){
            System.out.println(ex);
        }

        // Deserialization
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\test.txt"));

            Student s = (Student)in.readObject();

            System.out.println(s.id + " " + s.name);

        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}

class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}