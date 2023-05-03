package Swing_1.JFrame;

import javax.swing.*;

public class MyWindow extends JFrame { // vì JFrame là 1 lớp Abstract nên MyWindow có thể extend
                                           // và MyWindow có tất cả các phương thức của JFrame
    public MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showJF(){
        this.setVisible(true);
    }

    public void showJF(String title){
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showJF(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width,height);
        this.setVisible(true);
    }

    public void showJF(String title, int width, int height, int x, int y){
        this.setTitle(title);
        this.setSize(width,height);
        this.setLocation(x,y);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow mw1 = new MyWindow();
        mw1.showJF();

        MyWindow mw2 = new MyWindow();
        mw2.showJF("Window 2");

        MyWindow mw3 = new MyWindow();
        mw3.showJF("Window 3",600,400);

        MyWindow mw4 = new MyWindow();
        mw4.showJF("Window 4", 600, 400, 500, 250);
    }
}
