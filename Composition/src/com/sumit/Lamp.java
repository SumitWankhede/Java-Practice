package com.sumit;

/**
 * Created by Sumit on 26-Jun-17.
 */
public class Lamp {
    private boolean isClosed = false;

    public void plugged(){
        System.out.println("Lamp is plugged in");
    }

    public void switched(){
        System.out.println("Lamp is switched ON");
    }
}
