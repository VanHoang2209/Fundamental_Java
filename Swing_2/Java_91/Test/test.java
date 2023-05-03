package Swing_2.Java_91.Test;

import Swing_2.Java_91.View.MenuExampleView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MenuExampleView();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}