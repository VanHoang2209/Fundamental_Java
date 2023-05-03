package Swing_2.Java_95.View;

import Swing_2.Java_95.Controller.ThucDonController;
import Swing_2.Java_95.Model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public JRadioButton jRadioButton_Com;
    public JRadioButton jRadioButton_Pho;
    public JRadioButton jRadioButton_BanhMi;
    public ButtonGroup buttonGroup_monChinh;
    public JCheckBox jCheckBox_traSua;
    public JCheckBox jCheckBox_Cocacola;
    public JCheckBox jCheckBox_banhNgot;
    public JCheckBox jCheckBox_nem;
    public JLabel jLabel_ThongTin;
    private JButton jButton_ThanhToan;
    public ArrayList<JCheckBox> list_buttonGroup_monPhu;

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
        jPanel_monChinh.setLayout(new GridLayout(1,3));
        jRadioButton_Com = new JRadioButton("Cơm");
        jRadioButton_Com.setFont(font);
        jRadioButton_Pho = new JRadioButton("Phở");
        jRadioButton_Pho.setFont(font);
        jRadioButton_BanhMi = new JRadioButton("Bánh mì");
        jRadioButton_BanhMi.setFont(font);

        buttonGroup_monChinh = new ButtonGroup();
        buttonGroup_monChinh.add(jRadioButton_Com);
        buttonGroup_monChinh.add(jRadioButton_Pho);
        buttonGroup_monChinh.add(jRadioButton_BanhMi);
        jPanel_monChinh.add(jRadioButton_Com);
        jPanel_monChinh.add(jRadioButton_Pho);
        jPanel_monChinh.add(jRadioButton_BanhMi);

        JPanel jPanel_monPhu = new JPanel();
        jPanel_monPhu.setLayout(new GridLayout(2,2));
        jCheckBox_traSua = new JCheckBox("Trà sữa");
        jCheckBox_traSua.setFont(font);
        jCheckBox_Cocacola = new JCheckBox("Cocacola");
        jCheckBox_Cocacola.setFont(font);
        jCheckBox_banhNgot = new JCheckBox("Bánh ngọt");
        jCheckBox_banhNgot.setFont(font);
        jCheckBox_nem = new JCheckBox("Nem");
        jCheckBox_nem.setFont(font);

        list_buttonGroup_monPhu = new ArrayList<JCheckBox>();
        list_buttonGroup_monPhu.add(jCheckBox_traSua);
        list_buttonGroup_monPhu.add(jCheckBox_Cocacola);
        list_buttonGroup_monPhu.add(jCheckBox_banhNgot);
        list_buttonGroup_monPhu.add(jCheckBox_nem);

        jPanel_monPhu.add(jCheckBox_traSua);
        jPanel_monPhu.add(jCheckBox_Cocacola);
        jPanel_monPhu.add(jCheckBox_banhNgot);
        jPanel_monPhu.add(jCheckBox_nem);


        JPanel jPanel_luaChon = new JPanel();
        jPanel_luaChon.setLayout(new GridLayout(2,1));
        jPanel_luaChon.add(jPanel_monChinh);
        jPanel_luaChon.add(jPanel_monPhu);
        this.add(jPanel_luaChon,BorderLayout.CENTER);

        JPanel jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1,2));
        jLabel_ThongTin = new JLabel();
        jLabel_ThongTin.setFont(new Font("Arial",Font.BOLD,20));
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
