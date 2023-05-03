package Swing_1.JTextArea_JScrollPane.Controller;

import Swing_1.JTextArea_JScrollPane.View.TimKiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemListener implements ActionListener {
    private TimKiemView timKiemView;
    public TimKiemListener (TimKiemView timKiemView){
        this.timKiemView = timKiemView;
    }
    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiemView.timKiem();
    }
}
