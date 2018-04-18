package com.sumit;

/**
 * Created by Sumit on 27-Jun-17.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int additionalToner){
        if(additionalToner > 0 && additionalToner <= 100){
            tonerLevel += additionalToner;
            if (tonerLevel > 100) {
                tonerLevel = 100;
            }
        }
        else
            tonerLevel = -1;
        return tonerLevel;
    }

    public int print(int noOfPages){
        if(isDuplex == true){
            noOfPages /= 2;
            System.out.println("Printing is duplex printer");
        }
        pagesPrinted += noOfPages;
        return noOfPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
