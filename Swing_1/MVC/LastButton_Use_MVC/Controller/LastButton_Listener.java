package Swing_1.MVC.LastButton_Use_MVC.Controller;

import Swing_1.MVC.LastButton_Use_MVC.View.LastButton_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButton_Listener implements ActionListener {
    private LastButton_View lv;
    public LastButton_Listener(LastButton_View lv){
        this.lv = lv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if(event.equals("1")){
            this.lv.changeTo_1();
        } else if (event.equals("2")) {
            this.lv.changeTo_2();
        } else if (event.equals("3")) {
            this.lv.changeTo_3();
        } else if (event.equals("4")) {
            this.lv.changeTo_4();
        }
    }
}
