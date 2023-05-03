package Swing_2.Java_90.View;

import Swing_2.Java_90.Controller.MenuExampleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
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
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExampleController);
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); // Kí tự, phím trên bàn phím

        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(menuExampleController);
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.ALT_DOWN_MASK));

        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_F4);
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.ALT_DOWN_MASK));

        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_H); // ALT + H

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

    public void setTextJLabel(String s) {
    }
}