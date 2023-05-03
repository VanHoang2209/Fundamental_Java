package Swing_1.JPanel_LookAndFeel;

import javax.swing.*;
import java.awt.*;

public class Calculator_Temporary extends JFrame {
    public Calculator_Temporary(){
        this.setTitle("Calculator");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jtf = new JTextField(50);

        JPanel jPanel_Head = new JPanel();
        jPanel_Head.add(jtf,BorderLayout.CENTER);

        JButton jb_0 = new JButton("0");
        JButton jb_1 = new JButton("1");
        JButton jb_2 = new JButton("2");
        JButton jb_3 = new JButton("3");
        JButton jb_4 = new JButton("4");
        JButton jb_5 = new JButton("5");
        JButton jb_6 = new JButton("6");
        JButton jb_7 = new JButton("7");
        JButton jb_8 = new JButton("8");
        JButton jb_9 = new JButton("9");

        JButton jb_cong = new JButton("+");
        JButton jb_tru = new JButton("-");
        JButton jb_nhan = new JButton("*");
        JButton jb_chia = new JButton("/");
        JButton jb_bang = new JButton("=");

        JPanel jPanel_Buttons = new JPanel();
        jPanel_Buttons.setLayout(new GridLayout(5,3));

//        for (int i = 0; i < 10; i++) {
//            JButton jb = new JButton(i +"");
//            this.add(jb);
//        }

        jPanel_Buttons.add(jb_0);
        jPanel_Buttons.add(jb_1);
        jPanel_Buttons.add(jb_2);
        jPanel_Buttons.add(jb_3);
        jPanel_Buttons.add(jb_4);
        jPanel_Buttons.add(jb_5);
        jPanel_Buttons.add(jb_6);
        jPanel_Buttons.add(jb_7);
        jPanel_Buttons.add(jb_8);
        jPanel_Buttons.add(jb_9);
        jPanel_Buttons.add(jb_cong);
        jPanel_Buttons.add(jb_tru);
        jPanel_Buttons.add(jb_nhan);    
        jPanel_Buttons.add(jb_chia);
        jPanel_Buttons.add(jb_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel_Head,BorderLayout.NORTH);
        this.add(jPanel_Buttons, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try{
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // giao diện của hệ thống
            new Calculator_Temporary();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
