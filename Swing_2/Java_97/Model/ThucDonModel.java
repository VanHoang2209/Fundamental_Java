package Swing_2.Java_97.Model;

import java.util.StringTokenizer;

public class ThucDonModel {
    private String monChinh;
    private String monPhu;
    private double tongTien;
    public ThucDonModel(){
        this.monChinh = "";
        this.monPhu = "";
        this.tongTien = 0;
    }

    public String getMonChinh() {
        return monChinh;
    }

    public void setMonChinh(String monChinh) {
        this.monChinh = monChinh;
    }

    public String getMonPhu() {
        return monPhu;
    }

    public void setMonPhu(String monPhu) {
        this.monPhu = monPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void tinhTongTien() {
        this.tongTien = 0;
        if(this.monChinh.equals("Cơm")){
            tongTien += 20000;
        } else if (this.monChinh.equals("Phở")) {
            tongTien += 50000;
        } else if (this.monChinh.equals("Bánh mì")) {
            tongTien += 15000;
        }
        StringTokenizer stk = new StringTokenizer(this.monPhu,";");
        while (stk.hasMoreElements()){
            String monPhu = stk.nextToken();
            monPhu = monPhu.trim();
            if(monPhu.equals("Trà sữa")){
                tongTien += 5000;
            } else if (monPhu.equals("Cocacola")) {
                tongTien += 10000;
            } else if (monPhu.equals("Bánh ngọt")) {
                tongTien += 15000;
            } else if (monPhu.equals("Nem")) {
                tongTien += 20000;
            }
        }
    }
}
