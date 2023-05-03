package Swing_2.Java_97.Test;

import Swing_2.Java_97.View.ThucDonView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ThucDonView();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
