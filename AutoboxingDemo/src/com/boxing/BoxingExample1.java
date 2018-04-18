package com.boxing;

/**
 * Created by Sumit on 04-Jul-17.
 */
public class BoxingExample1 {
    public static void main(String[] args) {
        //
        int a = 50;
        Integer integer = new Integer(a); // Boxing

        Integer a2 = 5; // Boxing

        int a1 = a2; // Unboxing

        System.out.println(a + a1 + a2 + integer);
    }
}
