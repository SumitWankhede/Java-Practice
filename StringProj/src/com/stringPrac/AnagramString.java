package com.stringPrac;

import java.util.Arrays;

/**
 * Created by Sumit on 20-Jul-17.
 */
public class AnagramString {
    public static void main(String[] args) {
        isAnagram("Sumit", "Sumti");
        isAnagram("Jayant", "Vivek");
    }

    static void isAnagram(String str1, String str2){
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        boolean flag = true;

        if(str1.length() != str2.length()){
            flag = false;
        }
        else {
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            flag = Arrays.equals(charArray1,charArray2);
        }

        if(flag){
            System.out.println(str1 + " and " + str2 + " are anagram");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }

    }
}
