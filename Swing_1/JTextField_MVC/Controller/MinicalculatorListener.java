package Swing_1.JTextField_MVC.Controller;

import Swing_1.JTextField_MVC.View.MinicalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinicalculatorListener implements ActionListener {
    private MinicalculatorView minicalculatorView;
    public MinicalculatorListener(MinicalculatorView minicalculatorView){
        this.minicalculatorView = minicalculatorView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")){
            this.minicalculatorView.plus();
        } else if (button.equals("-")) {
            this.minicalculatorView.minus();
        } else if (button.equals("*")) {
            this.minicalculatorView.multiply();
        } else if (button.equals("/")) {
            this.minicalculatorView.devide();
        } else if (button.equals("^")) {
            this.minicalculatorView.pow();
        } else if (button.equals("%")) {
            this.minicalculatorView.mod();
        }
    }

}
