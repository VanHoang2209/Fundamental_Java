package Swing_2.Java_97.Controller;

import Swing_2.Java_97.View.ThucDonView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        String soTien_Chuoi = (String) JOptionPane.showInputDialog(
                thucDonView,
                thucDonView.jLabel_ThongTin.getText()
                        + "\nNhập vào số tiền:",
                "Thông báo",
                JOptionPane.PLAIN_MESSAGE);
        try{
            double soTien = Double.valueOf(soTien_Chuoi);
            JOptionPane.showMessageDialog(thucDonView,
                    "Trả lại cho khách: " +(soTien - thucDonView.thucDonModel.getTongTien()),
                    "Infor",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(thucDonView,
                    "Nhập dữ liệu sai!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
