package Swing_2.Java_96.View;

import Swing_2.Java_96.Controller.ThucDonController;
import Swing_2.Java_96.Model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public ButtonGroup buttonGroup_monChinh;
    public JLabel jLabel_ThongTin;
    private JButton jButton_ThanhToan;
    public ArrayList<JCheckBox> list_buttonGroup_monPhu;
    public JComboBox<String> jComboBox_MonChinh;
    public JList<String> jList_monPhu;

    public ThucDonView(){
        this.thucDonModel = new ThucDonModel();
        init();
    }
    public void init(){
        this.setTitle("Thực đơn");
        this.setSize(1500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        Font font = new Font("Arial",Font.BOLD,40);

        JLabel header = new JLabel("Thực đơn nhà hàng");
        header.setFont(font);

        JPanel jPanel_tieuDe = new JPanel();
        jPanel_tieuDe.add(header);
        this.add(jPanel_tieuDe,BorderLayout.NORTH);

        JPanel jPanel_monChinh = new JPanel();
        jPanel_monChinh.setLayout(new FlowLayout());
        String[] cacMonChinh = new String[] {"Cơm", "Phở", "Bánh mì"};
        jComboBox_MonChinh = new JComboBox<String>(cacMonChinh);
        jPanel_monChinh.add(jComboBox_MonChinh);
        jComboBox_MonChinh.setFont(font);


        JPanel jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new GridLayout(2,2));
        String[] cacMonPhu = new String[] {"Trà sữa", "Cocacola", "Bánh ngọt", "Nem"};
        jList_monPhu = new JList<String>(cacMonPhu);
        jList_monPhu.setFont(font);
        jPanel_monPhu.add(jList_monPhu);




        JPanel jPanel_luaChon = new JPanel();
        jPanel_luaChon.setLayout(new BorderLayout());
        jPanel_luaChon.add(jPanel_monChinh,BorderLayout.NORTH);
        jPanel_luaChon.add(jPanel_monPhu,BorderLayout.CENTER);
        this.add(jPanel_luaChon,BorderLayout.CENTER);

        JPanel jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1,2));
        jLabel_ThongTin = new JLabel();
        jLabel_ThongTin.setFont(new Font("Arial",Font.BOLD,15));
        jButton_ThanhToan = new JButton("Thanh toán");
        jButton_ThanhToan.setFont(font);
        ThucDonController thucDonController = new ThucDonController(this);
        jButton_ThanhToan.addActionListener(thucDonController);

        jPanel_ThanhToan.add(jLabel_ThongTin);
        jPanel_ThanhToan.add(jButton_ThanhToan);
        this.add(jPanel_ThanhToan,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void hienThiKetQua() {
        String kq = "Món chính: " + this.thucDonModel.getMonChinh()
                    + "; Món phụ: " + this.thucDonModel.getMonPhu()
                    + "; Tổng tiền: " + this.thucDonModel.getTongTien();
        this.jLabel_ThongTin.setText(kq);
    }
}
