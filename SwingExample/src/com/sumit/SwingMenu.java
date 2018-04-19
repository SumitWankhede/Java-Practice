package com.sumit;

import javax.swing.*;

/**
 * Created by Sumit on 02-Aug-17.
 */
public class SwingMenu {
    JMenu menu, subMenu;
    JMenuItem i1,i2,i3,i4,i5;

    SwingMenu(){
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");
        subMenu = new JMenu("Sub Menu");

        i1 = new JCheckBoxMenuItem("Item 1");
        i2 = new JCheckBoxMenuItem("Item 2");
        i3 = new JCheckBoxMenuItem("Item 3");
        i4 = new JCheckBoxMenuItem("Item 4");
        i5 = new JCheckBoxMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(subMenu);

        subMenu.add(i4);
        subMenu.add(i5);

        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingMenu s = new SwingMenu();
    }

}
