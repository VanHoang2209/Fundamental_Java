package Swing_2.Java_89.Controller;

import Swing_2.Java_89.View.MenuExampleView;

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
        if(button.equals("Open")){
            this.menuExampleView.setTextJlabel("Bạn đã click JmenuItem Open");
        } else if (button.equals("Exit")) {
//            this.menuExampleView.setTextJlabel("Bạn đã click JmenuItem Exit");
            System.exit(0);
        } else if (button.equals("Welcome")) {
            this.menuExampleView.setTextJlabel("Bạn đã click JmenuItem Welcome");
        }
    }
}
