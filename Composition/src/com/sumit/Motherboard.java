package com.sumit;

/**
 * Created by Sumit on 25-Jun-17.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int cardSlots;
    private int ramSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int cardSlots, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
