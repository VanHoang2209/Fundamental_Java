package Swing_1.Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_Test extends JFrame {
    public BorderLayout_Test(){
        this.setTitle("FlowLayout_Test");
        this.setSize(600,400);
        // căn giữa ở cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set Layout
        BorderLayout bd_1 = new BorderLayout();
        BorderLayout bd_2 = new BorderLayout(15,15);

//        this.setLayout(bd_1);
        this.setLayout(bd_2);
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");

        // add thành phần
        this.add(jb1,BorderLayout.NORTH);
        this.add(jb2,BorderLayout.SOUTH);
        this.add(jb3,BorderLayout.EAST);
        this.add(jb4,BorderLayout.WEST);
        this.add(jb5,BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout_Test();
    }
}