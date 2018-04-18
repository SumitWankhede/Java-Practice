package com.sumit;

import java.awt.*;

/**
 * Created by Sumit on 28-Jul-17.
 */
public class FirstAWT extends Frame {
    FirstAWT(){
        Button b = new Button("Click me");
        b.setBounds(30,100,80,30); // Setting button position
        add(b); // Adding button in frame
        setSize(300,300); // Setting size of a frame
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FirstAWT f = new FirstAWT();
    }
}
