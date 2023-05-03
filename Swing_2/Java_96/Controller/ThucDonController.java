package Swing_2.Java_96.Controller;

import Swing_2.Java_96.View.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Objects;

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
        String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();

        String monPhu = "";
        Object[]  luaChonMonPhu = thucDonView.jList_monPhu.getSelectedValues();
        for(Object o : luaChonMonPhu){
                monPhu = monPhu + o.toString() +"; ";
        }
        thucDonView.thucDonModel.setMonChinh(monChinh);
        thucDonView.thucDonModel.setMonPhu(monPhu);
        thucDonView.thucDonModel.tinhTongTien();
        thucDonView.hienThiKetQua();
    }
}
