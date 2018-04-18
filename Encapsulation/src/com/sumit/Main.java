package com.sumit;

/**
 * Created by Sumit on 27-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        // Encapsulation protects actual data members to be accessed outside the class
        // you can only  access them using methods/functions

        Player player = new Player("Sumit",20,"Sword");
        System.out.println("Initial health of player is: " + player.getHealth());

        //////////////////////////////////////////////////////////////////

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count is " + printer.getPagesPrinted());

        int pagesPrinted = printer.print(4);
        System.out.println("Pages printed are: " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.print(2);
        System.out.println("Pages printed are: " + pagesPrinted + ". New total print count for printer = " + printer.getPagesPrinted());
    }
}
