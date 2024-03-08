package com.fanzhao.test.others;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame2 extends JFrame implements MouseListener {

    public  MyFrame2(){
        this.setSize(500,500);
        this.setTitle("NewJFrame");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(2);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        setButton();
    }
    JButton jbt=new JButton("TouchMe");
    private void setButton(){
        jbt.setBounds(0,0,300,300);
        jbt.addMouseListener(this);
        this.getContentPane().add(jbt);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
    }
}
