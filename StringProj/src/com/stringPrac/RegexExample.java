package com.stringPrac;

import java.util.regex.*;

/**
 * Created by Sumit on 21-Jul-17.
 */
public class RegexExample {

    public static void main(String[] args) {

        // 1st way
        Pattern p = Pattern.compile(".s"); // represent single character
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();

        // 2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        // 3rd way
        boolean b3 = Pattern.matches(".s","as");

        System.out.println(b1 + " " + b2 + " " + b3);

        // regular expression example
        System.out.println(Pattern.matches("..s", "mas"));
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)


    }

}
