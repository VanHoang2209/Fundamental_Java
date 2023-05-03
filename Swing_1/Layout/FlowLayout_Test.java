package Swing_1.Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Test extends JFrame {
    public FlowLayout_Test(){
        this.setTitle("FlowLayout_Test");
        this.setSize(600,400);
        // căn giữa ở cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set Layout
        FlowLayout fl_1 = new FlowLayout();
        FlowLayout fl_2 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout fl_3 = new FlowLayout(FlowLayout.CENTER,50,50);
        FlowLayout fl_4 = new FlowLayout(FlowLayout.LEFT,100,20);
        FlowLayout fl_5 = new FlowLayout(FlowLayout.LEADING);
        FlowLayout fl_6 = new FlowLayout(FlowLayout.TRAILING);

//        this.setLayout(fl_1);
//        this.setLayout(fl_2);
//        this.setLayout(fl_3);
        this.setLayout(fl_4);
//        this.setLayout(fl_5);
//        this.setLayout(fl_6);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");

        // add thành phần
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayout_Test();
    }
}
