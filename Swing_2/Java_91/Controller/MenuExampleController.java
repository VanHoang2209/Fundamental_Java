package Swing_2.Java_91.Controller;

import Swing_2.Java_91.View.MenuExampleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {
    private MenuExampleView menuExampleView;
    public MenuExampleController(MenuExampleView menuExampleView){
        this.menuExampleView = menuExampleView;
    }


    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if(button.equals("Exit")){
            System.exit(0);
        }else {
            this.menuExampleView.setTextJlabel("Bạn đã click: " + button);
        }
    }
}