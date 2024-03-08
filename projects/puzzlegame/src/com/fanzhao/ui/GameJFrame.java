package com.fanzhao.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //设置游戏步数
    int step=0;
    //设置胜利条件
    int win[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    String path="image\\";
    //创建二维数组，创建图片是会根据二维数组加载
    int[][] data=new int[4][4];
    //用来存储0的位置坐标
    int y,x;
    public GameJFrame(){
        //界面初始化
        initJFrame();
        //菜单初始化
        initMenu();
                            /*  //打乱图片
                             randomImage();
                            //初始化图片
                             initImage();
                            //获取到空白图“0”在二维数组中的位置
                             getZeroPosition();*/
        initGameData();
        //界面可视化
        this.setVisible(true);
    }
    private void randomImage(){
       //创建一维数组
        int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        //打乱数组
        Random r=new Random();
        for (int i=0;i<arr1.length;i++) {
            int randomIndex=r.nextInt(arr1.length);
            int temp=arr1[i];
            arr1[i]=arr1[randomIndex];
            arr1[randomIndex]=temp;
        }
        //创建二维数组并赋予一维数组的值
        //int data[][]=new int[4][4];
        int next=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j]=arr1[next];
                next++;
            }
        }


    }

    private void getZeroPosition(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==0){
                    y=i;x=j;
                    //System.out.println(y+" "+x);
                }
            }
        }
    }

    private void initImage(){
        //清空图片
        this.getContentPane().removeAll();
        //显示步数
        JLabel stepJlabel=new JLabel("步数:"+step);
        stepJlabel.setBounds(0,0,110,110);
        this.getContentPane().add(stepJlabel);
        //显示胜利图片
        if(win()){
            JLabel victory=new JLabel(new ImageIcon(path+"victory.png"));
            victory.setBounds(0,0,560,375);
            this.getContentPane().add(victory);
        }
        int imageNum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                imageNum=data[i][j];
                //创建图片对象
                ImageIcon icon=new ImageIcon(path+"test\\t-"+imageNum+".png");
                //创建容器对象管理图片
                JLabel jLabel=new JLabel(icon);
                //将管理容器放入到界面中
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
                jLabel.setBounds(138*j+185,136*i+100,138,136);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
            }
        }
        //设置背景图片
        ImageIcon background2=new ImageIcon(path+"bg\\bg2.png");
        ImageIcon background1=new ImageIcon(path+"bg\\test.png");
        JLabel jLabelbg1=new JLabel(background1);

        //jLabelbg1.setBounds(0,-15,1096,906);
        //this.getContentPane().add(jLabelbg1);
        JLabel jLabelBg2=new JLabel(background2);
        jLabelBg2.setBounds(0,0,1096,930);
        this.getContentPane().add(jLabelBg2);
        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJFrame(){
        //设置宽高
        //this.setSize(603,680);
        this.setSize(900,800);
        //标题显示
        this.setTitle("Puzzle");
        //页面居中
        this.setLocationRelativeTo(null);
        //关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //添加键盘监听
        this.addKeyListener(this);
    }

    private void initMenu(){
        //创建菜单栏
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");
        //创建菜单组件
        JMenuItem restartJMenu=new JMenuItem("重新游戏");
        JMenuItem reLoginJMenu=new JMenuItem("重新登录");
        JMenuItem closeJMenu=new JMenuItem("关闭游戏");

        JMenuItem account=new JMenuItem("公众号");
        //组件拼接到菜单
        functionJMenu.add(restartJMenu);
        functionJMenu.add(reLoginJMenu);
        functionJMenu.add(closeJMenu);

        aboutJMenu.add(account);
        //菜单拼接到菜单栏
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //取消默认界面布局
        this.setLayout(null);
        //给界面显示菜单
        this.setJMenuBar(jMenuBar);
        //菜单绑定事件
        restartJMenu.addActionListener(this);
    }

    private void initGameData(){
        step=0;
        randomImage();
        initImage();
        getZeroPosition();
    }
        //键盘监听方法重写
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //显示完整图片
        int code=e.getKeyCode();
        if(code==65){
        this.getContentPane().removeAll();
        ImageIcon showComplete=new ImageIcon(path+"test\\test.png");
        JLabel jLabelShowComplete=new JLabel(showComplete);
        jLabelShowComplete.setBounds(180,100,555,547);
        this.getContentPane().add(jLabelShowComplete);
            //设置背景图片
            ImageIcon background2=new ImageIcon(path+"bg\\bg2.png");
            ImageIcon background1=new ImageIcon(path+"bg\\test.png");
            JLabel jLabelbg1=new JLabel(background1);

            //jLabelbg1.setBounds(0,-15,1096,906);
            //this.getContentPane().add(jLabelbg1);
            JLabel jLabelBg2=new JLabel(background2);
            jLabelBg2.setBounds(0,0,1096,930);
            this.getContentPane().add(jLabelBg2);
        this.getContentPane().repaint();
       }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //胜利则无法操作
        if(win()){
            return;
        }
        //左37；上38；右；39；下40
        int code=e.getKeyCode();
        //向上移动
        if(code==38&&y!=3){
            data[y][x]=data[y+1][x];
            data[y+1][x]=0;
            y++;
            step++;
            this.initImage();

        }
        //向下移动
        else if(code==40&&y!=0){
            data[y][x]=data[y-1][x];
            data[y-1][x]=0;
            y--;
            step++;
            this.initImage();

        }
        //向左移动
        else if(code==37&&x!=3){
            data[y][x]=data[y][x+1];
            data[y][x+1]=0;
            x++;
            step++;
            this.initImage();

        }
        //向右移动
        else if(code==39&&x!=0){
            data[y][x]=data[y][x-1];
            data[y][x-1]=0;
            x--;
            step++;
            this.initImage();

        }
        //按A显示完整图片
        else if(code==65){
            this.initImage();
        }
        //按W直接复原
        else if(code==87){
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    data[i][j]=win[i][j];
                }
            }
            this.initImage();
        }

    }
    //判断胜利
    public boolean win(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        initGameData();
    }
    //菜单鼠标监听

}
