package Swing_1.JFrame;

import javax.swing.*;

public class JFrame_Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // Gán tên
        jf.setTitle("Ví dụ về JFrame");
        // Gán kích cỡ
        jf.setSize(600,400);

//        while(true){
//            System.out.println("Chương trình đang chạy.");
//        }
        // Gán vị trí hiển thị
        jf.setLocation(500,250);

        //thoát ra khỏi chương trình khi đóng cửa sổ JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cho phép hiển thị
        jf.setVisible(true);
    }
}
