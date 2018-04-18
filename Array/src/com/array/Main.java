package com.array;

import java.util.Scanner;

/**
 * Created by Sumit on 28-Jun-17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] myIntegerArray = getInteger(length);

        for (int i = 0; i < myIntegerArray.length; i++){
            System.out.println("Element " + i + " is " + myIntegerArray[i]);
        }
    }

    public static int[] getInteger(int length){
        System.out.println("Enter " + length + " values in array " + "\r");
        int[] values = new int[length];

        for(int i =0; i < length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
