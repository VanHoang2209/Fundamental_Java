package Swing_1.MVC.View;

import Swing_1.MVC.Controller.Counter_Listener;
import Swing_1.MVC.Model.Counter_Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Counter_View extends JFrame {
    private Counter_Model counterModel;
    private JButton jb_up;
    private JButton jb_down;
    private JButton jb_reset;
    private JLabel jl_value;
    public Counter_View(){
        this.counterModel = new Counter_Model();
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new Counter_Listener(this);

        jb_up = new JButton("up");
        jb_up.addActionListener(ac);

        jb_down = new JButton("down");
        jb_down.addActionListener(ac);

        jb_reset = new JButton("reset");
        jb_reset.addActionListener(ac);

        jl_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER); // label chỉ nhận vào text

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(jb_up,BorderLayout.WEST);
        jp.add(jb_down,BorderLayout.EAST);
        jp.add(jl_value,BorderLayout.CENTER);
        jp.add(jb_reset,BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jp,BorderLayout.CENTER);
    }

    public void Increasement(){
        this.counterModel.Increasement();
        this.jl_value.setText(this.counterModel.getValue() +" ");
    }
    public void Decreasement(){
        this.counterModel.Decreasement();
        this.jl_value.setText(this.counterModel.getValue()+ " ");
    }
    public void reset(){
        this.counterModel.reset();
        this.jl_value.setText(this.counterModel.getValue() + " ");
    }
}
