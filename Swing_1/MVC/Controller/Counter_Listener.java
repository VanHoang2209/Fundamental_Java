package Swing_1.MVC.Controller;

import Swing_1.MVC.View.Counter_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_Listener implements ActionListener {
    private Counter_View ctv;
    public Counter_Listener(Counter_View ctv){
        this.ctv = ctv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("You pressed the button!");

        String src = e.getActionCommand();
        System.out.println("You pressed the button: " + src);

        if(src.equals("up")){
            this.ctv.Increasement();
        }
        else if(src.equals("down")){
            this.ctv.Decreasement();
        } else if (src.equals("reset")) {
            this.ctv.reset();
        }
    }
}
