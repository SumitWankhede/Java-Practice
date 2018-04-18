package com.sumit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sumit on 28-Jul-17.
 */
public class ButtonExample {
    public static void main(String[] args) {

        Frame f = new Frame("Button Example");
        final TextField tf = new TextField();

        tf.setBounds(50,50,150,20);

        Button b = new Button("Hit me");

        b.setBounds(50,100,60,30);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello, Welcome back!");
            }
        });

        f.add(b);
        f.add(tf);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
