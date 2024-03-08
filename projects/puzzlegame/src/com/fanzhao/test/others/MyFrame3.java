package com.fanzhao.test.others;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame3 implements KeyListener, MouseListener {
    JFrame jFrame=new JFrame();
    public MyFrame3(){

        jFrame.setTitle("Test3_KEY");
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(2);
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLayout(null);

        //Menu
        JMenuBar jMenuBar=new JMenuBar();
        JMenu jMenu1=new JMenu("打印功能");
        JMenuItem jMenuItem1=new JMenuItem("打印success");
        jMenu1.add(jMenuItem1);
        jMenuBar.add(jMenu1);
        jFrame.setLayout(null);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setVisible(true);
        keyEvents();
        jMenuItem1.addMouseListener(this);
    }


    private void keyEvents(){
       jFrame.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 65) {
            System.out.println("A");
        } else if (key == 66) {
            System.out.println("B");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        System.out.println(code);
    }
//
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("success!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
