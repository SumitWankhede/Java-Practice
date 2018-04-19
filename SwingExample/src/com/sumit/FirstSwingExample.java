package com.sumit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sumit on 31-Jul-17.
 */
public class FirstSwingExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Swing Frame");
        JButton b = new JButton("Hit me");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        //f.setVisible(true);

        Simple s = new Simple();
    }
}

class Simple{
    JFrame f;
    Simple(){
        f = new JFrame("Simple Frame - Swing");
        JButton b = new JButton("Hit me");
        JTextField tf = new JTextField();
        tf.setBounds(100,100,100,100);
        JPasswordField jp = new JPasswordField();
        JOptionPane.showMessageDialog(f,"Hi, World","Alert",JOptionPane.WARNING_MESSAGE);


        f.add(jp);
        f.add(b);
        f.add(tf);
        b.setBounds(50,50,100,40);
        jp.setBounds(150,150,100,40);
        f.setSize(400,500);

        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("The final countdown");
            }
        });
    }
}
