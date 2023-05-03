package Swing_2.Java_95.Controller;

import Swing_2.Java_95.Model.ThucDonModel;
import Swing_2.Java_95.View.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class ThucDonController implements ActionListener {
    private ThucDonView thucDonView;
    public ThucDonController(ThucDonView thucDonView){
        this.thucDonView = thucDonView;
    }
    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String monChinh = "";
        Enumeration<AbstractButton> button_MonChinh = thucDonView.buttonGroup_monChinh.getElements();
        while(button_MonChinh.hasMoreElements()){
            AbstractButton  b = button_MonChinh.nextElement();
            if(b.isSelected()){
                monChinh = b.getText();
            }
        }

        String monPhu = "";
        for(AbstractButton b : thucDonView.list_buttonGroup_monPhu){
            if(b.isSelected()){
                monPhu = monPhu + b.getText() +"; ";
            }
        }
        thucDonView.thucDonModel.setMonChinh(monChinh);
        thucDonView.thucDonModel.setMonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }
}
