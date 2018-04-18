package com.exercise;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Sumit on 28-Jun-17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] values = new int[5];
    private static int[] sortedArray;
    public static void main(String[] args) {
        getIntegers();
        sortArray();
        printArray();
    }

    public static void getIntegers(){

        System.out.println("Enter 5 elements: ");
        for(int i=0; i<5; i++){
            values[i] = scanner.nextInt();
        }
    }

    public static void sortArray(){
        // logic
        sortedArray = Arrays.copyOf(values,values.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for(int i = 0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static void printArray(){
        for(int i = 0; i < 5; i++){
            System.out.println(sortedArray[i]);
        }
    }
}
