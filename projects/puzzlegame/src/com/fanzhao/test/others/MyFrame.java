package com.fanzhao.test.others;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame extends JFrame implements ActionListener {

    public MyFrame() {
        this.setSize(500, 500);
        this.setTitle("New Frame");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.setLayout(null);
        //调用按钮设置
        setButton();
    }

    JButton jbt1 = new JButton("Press Me");
    JButton jbt2 = new JButton("点我");

    private void setButton() {

        jbt1.setBounds(0, 0, 100, 60);
        this.getContentPane().add(jbt1);
        jbt1.addActionListener(this);


        jbt2.setBounds(100, 60, 100, 60);
        this.getContentPane().add(jbt2);
        jbt2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jbt1) {
            jbt1.setSize(150, 100);
            System.out.println("Bigger");
        } else if (source == jbt2) {

            Random r = new Random();
            jbt2.setLocation(r.nextInt(350), r.nextInt(350));
            System.out.println("Changed location");
        }
    }
}
