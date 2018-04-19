package com.stringPrac;

/**
 * Created by Sumit on 20-Jul-17.
 */
public class StringProj {
    public static void main(String[] args) {
        System.out.println(StringFormatter.reverseWord("Another One Bites the Dust"));
    }
}

class StringFormatter{
    public static String reverseWord(String in){
            String words[] = in.split("\\s");
            String reverseString = "";

            for(String w:words){
                StringBuilder sb = new StringBuilder(w);
                sb.reverse();
                reverseString += sb.toString();
            }

            return reverseString;
    }
}