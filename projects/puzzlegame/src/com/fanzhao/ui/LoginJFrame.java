package com.fanzhao.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    public LoginJFrame(){
        JFrame loginJFrame=new JFrame();
        loginJFrame.setSize(488,430);
        loginJFrame.setVisible(true);
        //标题显示
        loginJFrame.setTitle("Login");
        //页面居中
        loginJFrame.setLocationRelativeTo(null);
        //关闭模式
        loginJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
