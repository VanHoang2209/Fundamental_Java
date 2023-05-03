package Swing_1.JTextArea_JScrollPane.Test;

import Swing_1.JTextArea_JScrollPane.View.TimKiemView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new TimKiemView();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
