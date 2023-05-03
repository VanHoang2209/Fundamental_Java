package Swing_1.MVC.MouseEvent.View;

import Swing_1.MVC.MouseEvent.Controller.MouseExampleController;
import Swing_1.MVC.MouseEvent.Model.MouseExampleModel;

import javax.swing.*;
import java.awt.*;

public class MouseExampleView extends JFrame {
    private MouseExampleModel mouseExampleModel;
    private JPanel jPanel_Mouse;
    private JPanel jPanel_Info;
    private JLabel jLabel_position;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_countValue;
    private JLabel jLabel_checkIn;
    private JLabel jLabel_checkInValue;
    private JLabel jLabel_empty1;
    private JLabel jLabel_empty2;

    public MouseExampleView() throws HeadlessException {
        this.mouseExampleModel = new MouseExampleModel();
        this.init();
    }

    public void init(){
        this.setTitle("Mouse Example");
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,20);
        MouseExampleController mouseExampleController = new MouseExampleController(this);

        jPanel_Mouse = new JPanel();
        jPanel_Mouse.setBackground(Color.YELLOW);
        jPanel_Mouse.addMouseListener(mouseExampleController);
        jPanel_Mouse.addMouseMotionListener(mouseExampleController);

        jPanel_Info = new JPanel();
        jPanel_Info.setLayout(new GridLayout(3,3));

        jLabel_position = new JLabel("Position: ");
        jLabel_x = new JLabel(" x = ");
        jLabel_y = new JLabel(" y = ");
        jLabel_count = new JLabel("Number of clicks: " );
        jLabel_countValue = new JLabel("n");
        jLabel_checkIn = new JLabel("Mouse is in component: ");
        jLabel_checkInValue = new JLabel("no");
        jLabel_empty1 = new JLabel();
        jLabel_empty2 = new JLabel();

        jLabel_position.setFont(font);
        jLabel_x.setFont(font);
        jLabel_y.setFont(font);
        jLabel_count.setFont(font);
        jLabel_checkIn.setFont(font);
        jLabel_checkInValue.setFont(font);
        jLabel_countValue.setFont(font);

        jPanel_Info.add(jLabel_position);
        jPanel_Info.add(jLabel_x);
        jPanel_Info.add(jLabel_y);
        jPanel_Info.add(jLabel_count);
        jPanel_Info.add(jLabel_countValue);
        jPanel_Info.add(jLabel_empty1);
        jPanel_Info.add(jLabel_checkIn);
        jPanel_Info.add(jLabel_checkInValue);
        jPanel_Info.add(jLabel_empty2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_Mouse,BorderLayout.CENTER);
        this.add(jPanel_Info,BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void click(){
        this.mouseExampleModel.addClick();
        this.jLabel_countValue.setText(this.mouseExampleModel.getCount()+"");
    }
    public void enter(){
        this.mouseExampleModel.enter();
        this.jLabel_checkInValue.setText(this.mouseExampleModel.getCheckIn());
    }
    public void update(int x, int y){
        this.mouseExampleModel.setX(x);
        this.mouseExampleModel.setY(y);
        this.jLabel_x.setText(this.mouseExampleModel.getX()+"");
        this.jLabel_y.setText(this.mouseExampleModel.getY()+"");
    }
    public void exit(){
        this.mouseExampleModel.exit();
        this.jLabel_checkInValue.setText(this.mouseExampleModel.getCheckIn());
    }
}
