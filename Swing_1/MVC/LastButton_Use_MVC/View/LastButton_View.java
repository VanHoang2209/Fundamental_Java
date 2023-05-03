package Swing_1.MVC.LastButton_Use_MVC.View;

import Swing_1.MVC.LastButton_Use_MVC.Controller.LastButton_Listener;
import Swing_1.MVC.LastButton_Use_MVC.Model.LastButton_Model;

import javax.swing.*;
import java.awt.*;

public class LastButton_View extends JFrame {
    private LastButton_Model lastButton_model;
    private JLabel jLabel;

    public LastButton_View(){
        this.lastButton_model = new LastButton_Model();
        this.init();
    }

    public void init(){
        this.setTitle("Last Button");
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        LastButton_Listener ll = new LastButton_Listener(this);

        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2,2));

        Font font = new Font("Arial",Font.BOLD,50);

        JButton jb_1 = new JButton("1");
        jPanel_Center.add(jb_1);
        jb_1.setFont(font);
        jb_1.addActionListener(ll);

        JButton jb_2 = new JButton("2");
        jPanel_Center.add(jb_2);
        jb_2.setFont(font);
        jb_2.addActionListener(ll);

        JButton jb_3 = new JButton("3");
        jPanel_Center.add(jb_3);
        jb_3.setFont(font);
        jb_3.addActionListener(ll);

        JButton jb_4 = new JButton("4");
        jPanel_Center.add(jb_4);
        jb_4.setFont(font);
        jb_4.addActionListener(ll);

        JPanel jPanel_Footer = new JPanel();
        jLabel = new JLabel("-------");
        jPanel_Footer.add(jLabel);
        jLabel.setFont(font);

        this.setLayout(new BorderLayout());

        this.add(jPanel_Center,BorderLayout.CENTER);
        this.add(jPanel_Footer,BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void changeTo_1(){
        this.lastButton_model.setValue_1();
        jLabel.setText("Last Button: "+this.lastButton_model.getValue());
    }
    public void changeTo_2(){
        this.lastButton_model.setValue_2();
        jLabel.setText("Last Button: "+this.lastButton_model.getValue());
    }
    public void changeTo_3(){
        this.lastButton_model.setValue_3();
        jLabel.setText("Last Button: "+this.lastButton_model.getValue());
    }
    public void changeTo_4(){
        this.lastButton_model.setValue_4();
        jLabel.setText("Last Button: "+this.lastButton_model.getValue());
    }
}
