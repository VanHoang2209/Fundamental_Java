package Swing_2.Java_99.Test;

import Swing_2.Java_99.View.MyNotepadView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyNotepadView();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
