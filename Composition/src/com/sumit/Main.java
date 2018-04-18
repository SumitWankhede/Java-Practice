package com.sumit;

/**
 * Created by Sumit on 25-Jun-17.
 */
public class Main {
    public static void main(String[] args) {
        // HAS-A relation: for example computer HAS A motherboard, case, monitor
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("B903","Dell","240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast","Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "Red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
