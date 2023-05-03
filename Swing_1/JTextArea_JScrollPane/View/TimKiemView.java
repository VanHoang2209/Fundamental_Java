package Swing_1.JTextArea_JScrollPane.View;

import Swing_1.JTextArea_JScrollPane.Controller.TimKiemListener;
import Swing_1.JTextArea_JScrollPane.Model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JLabel jLabel_VanBan;
    private JTextArea jTextArea_VanBan;
    private JLabel jLabel_TuKhoa;
    private JTextField jTextField_TuKhoa;
    private JLabel jLabel_KetQua;

    public TimKiemView() throws HeadlessException{
        this.timKiemModel = new TimKiemModel();
        init();

    }

    public void init(){
        this.setTitle("Tìm kiếm");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,40);

//        Center
        jLabel_VanBan = new JLabel("Văn Bản");
        jLabel_VanBan.setFont(font);
        jTextArea_VanBan = new JTextArea(100,100);
        jTextArea_VanBan.setFont(font);

                                                                    // vertica//        JScrollPane jScrollPane = new JScrollPane(jTextArea_VanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);l là thanh dọc
                                                                    // horizontal là thanh ngang
        JScrollPane jScrollPane = new JScrollPane(jTextArea_VanBan);

//        Footer
        TimKiemListener timKiemListener = new TimKiemListener(this);

        jLabel_TuKhoa = new JLabel("Từ Khoá");
        jLabel_TuKhoa.setFont(font);
        jTextField_TuKhoa = new JTextField();
        jTextField_TuKhoa.setFont(font);

        JButton jButton = new JButton("Thống kê");
        jButton.setFont(font);
        jButton.setBackground(Color.blue);
        jButton.addActionListener(timKiemListener);

        jLabel_KetQua = new JLabel();
        jLabel_KetQua.setBackground(Color.YELLOW);
        jLabel_KetQua.setFont(font);
        jLabel_KetQua.setOpaque(true);

        JPanel jPanelFooter = new JPanel();
        jPanelFooter.setLayout(new GridLayout(2,2,10,10));
        jPanelFooter.add(jLabel_TuKhoa);
        jPanelFooter.add(jTextField_TuKhoa);
        jPanelFooter.add(jButton);
        jPanelFooter.add(jLabel_KetQua);

        this.setLayout(new BorderLayout());
        this.add(jLabel_VanBan,BorderLayout.NORTH);
        this.add(jScrollPane,BorderLayout.CENTER); // jScrollPane đã chứa JTextArea_VanBan
        this.add(jPanelFooter, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void timKiem(){
        this.timKiemModel.setVanBan(jTextArea_VanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_TuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_KetQua.setText(this.timKiemModel.getKetQua());
    }
}
