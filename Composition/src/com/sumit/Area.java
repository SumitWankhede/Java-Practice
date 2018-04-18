package com.sumit;

/**
 * Created by Sumit on 26-Jun-17.
 */
public class Area {

    private int length;
    private int height;
    private int breadth;

    public Area(int length, int height, int breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    public int calcArea(){
        return length*height*breadth;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
