package com.sumit;

/**
 * Created by Sumit on 26-Jun-17.
 */
public class TV {
    private String model;
    private String manufacturer;
    private Resolution tvResolution;

    public TV(String model, String manufacturer, Resolution tvResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.tvResolution = tvResolution;
    }

    public void switchON(){
        System.out.println("TV is switched on");
    }
}
