package com.sumit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sumit on 02-Aug-17.
 */
public class NotepadExample implements ActionListener{

    JFrame f;
    JMenuBar mb = new JMenuBar();
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;
    JProgressBar jp;

    NotepadExample(){
        f = new JFrame("Notepad ++");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("SelectAll");

        jp = new JProgressBar(0,2000);
        jp.setBounds(40,40,160,30);
        jp.setValue(0);
        jp.setStringPainted(true);
        f.add(jp);

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        ta = new JTextArea();
        ta.setBounds(5,5,360,320);

        f.add(mb);
        f.add(ta);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        int i = 0;
        if(e.getSource() == cut){
            while (i < 2000){
                i += 20;
                jp.setValue(i);
                try{Thread.sleep(150);}catch(Exception e1){}
            }
            ta.cut();
        }
        else if(e.getSource() == copy){
            while (i < 2000){
                i += 20;
                jp.setValue(i);
                try{Thread.sleep(150);}catch(Exception e2){}
            }
            ta.copy();
        }
        else if(e.getSource() == paste){
            while (i < 2000){
                i += 20;
                jp.setValue(i);
                try{Thread.sleep(150);}catch(Exception e3){}
            }
            ta.paste();
        }
        else if(e.getSource() == selectAll){
            while (i < 2000){
                i += 20;
                jp.setValue(i);
                try{Thread.sleep(150);}catch(Exception e4){}
            }
            ta.selectAll();
        }
    }

    public static void main(String[] args) {
        NotepadExample n = new NotepadExample();
    }
}
