package Swing_2.Java_93.Test;

import Swing_2.Java_93.View.MenuExampleView;

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