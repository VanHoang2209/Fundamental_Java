package Swing_1.MVC.MouseEvent.Test;

import Swing_1.MVC.MouseEvent.View.MouseExampleView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MouseExampleView();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
