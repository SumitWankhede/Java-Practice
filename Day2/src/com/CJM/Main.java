package com.CJM;

public class Main {

    public static void main(String[] args) {
        // Car IS a Vehicle


        // PC HAS monitor, motherboard,

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer", 27, new Resolution(2540, 1440));

        MotherBoard themotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, themotherBoard);
        thePC.getMonitor().drawPixelAt(1500,1200, "Red");

        thePC.getMotherBoard().loadProgram("Windows 10");

        thePC.getTheCase().pressPowerButton();
    }
}
