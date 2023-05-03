package Swing_2.Java_89.View;

import Swing_2.Java_89.Controller.MenuExampleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private final JLabel jLabel;

    public MenuExampleView() throws HeadlessException {
        this.setTitle("Menu Example");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo controller
        MenuExampleController menuExampleController = new MenuExampleController(this);
        // Tạo thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        // Tạo 1 menu
        JMenu jMenu_file = new JMenu("File");

        // Tạo các menu con
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(menuExampleController);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExampleController);
        jMenu_help.add(jMenuItem_welcome);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

        // Thêm thanh menu vào chương trình
        this.setJMenuBar(jMenuBar);

        // Tạo label hiển thị
        Font font = new Font("Arial",Font.BOLD,50);
        jLabel = new JLabel();


        this.setLayout(new BorderLayout());

        this.add(jLabel,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public void setTextJlabel(String s){
        this.jLabel.setText(s);
    }
}
