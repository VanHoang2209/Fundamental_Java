package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.Scanner;

public class PhongBanKhoa {
    protected String maPBk;
    protected String tenPBK;
    public PhongBanKhoa(String maPBk, String tenPBK){
        this.maPBk = maPBk;
        this.tenPBK = tenPBK;
    }
    public PhongBanKhoa(){
        this.maPBk = "";
        this.tenPBK = "";
    }

    public String getMaPBk() {
        return maPBk;
    }

    public void setMaPBk(String maPBk) {
        this.maPBk = maPBk;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }
//    public void inputPBK(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ma phong ban khoa: ");
//        this.maPBk = sc.nextLine();
//        System.out.println("Nhap ten phong ban khoa: ");
//        this.tenPBK = sc.nextLine();
//    }

}
