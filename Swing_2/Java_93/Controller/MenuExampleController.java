package Swing_2.Java_93.Controller;

import Swing_2.Java_93.View.MenuExampleView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener{
    private MenuExampleView menuExampleView;

    public MenuExampleController(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if(button.equals("Exit")) {
            System.exit(0);
        }
        if (button.equals("Toolbar")) {
            System.out.println("Toolbar");
            AbstractButton checkBox  = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if (check) {
                System.out.println("check");
                this.menuExampleView.enableToobar();
            } else {
                System.out.println("uncheck");
                this.menuExampleView.disableToobar();
            }
        } else {
            this.menuExampleView.setTextJLabel("Bạn đã click: " + button);
        }
    }
}