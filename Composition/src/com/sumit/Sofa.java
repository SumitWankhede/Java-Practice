package com.sumit;

/**
 * Created by Sumit on 26-Jun-17.
 */
public class Sofa {
    private String model;
    private String brand;
    private int capacity;

    public Sofa(String model, String brand, int capacity) {
        this.model = model;
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
