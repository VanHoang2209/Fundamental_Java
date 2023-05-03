package Swing_1.Layout;

import javax.swing.*;
import java.awt.*;

public class GridLayout_Test extends JFrame {
    public GridLayout_Test(){
        this.setTitle("GridLayout_Test");
        this.setSize(600,400);
    // căn giữa ở cửa sổ chương trình
        this.setLocationRelativeTo(null);

    // Set Layout
    GridLayout gl_1 = new GridLayout();
    GridLayout gl_2 = new GridLayout(4,5);
    GridLayout gl_3 = new GridLayout(4,4,50,50);

//    this.setLayout(gl_1);
    this.setLayout(gl_2);
//    this.setLayout(gl_3);

//    JButton jb1 = new JButton("1");
//    JButton jb2 = new JButton("2");
//    JButton jb3 = new JButton("3");

        for (int i = 0; i < 20; i++) {
            JButton jb = new JButton(i + ""); // i là số nguyên + thêm khoảng trắng thì i là văn bản
            this.add(jb);
        }

    // add thành phần
//        this.add(jb1);
//        this.add(jb2);
//        this.add(jb3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
}

    public static void main(String[] args) {
        new GridLayout_Test();
    }
}
