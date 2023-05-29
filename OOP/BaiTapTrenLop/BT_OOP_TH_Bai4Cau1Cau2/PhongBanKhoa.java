package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import java.util.Scanner;

public class PhongBanKhoa {
    private String maPBK;
    private String tenPBK;
    public PhongBanKhoa(String maPBK, String tenPBK){
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }
    public PhongBanKhoa(){
        this.maPBK = "";
        this.tenPBK = "";
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }
    public void intputPBK(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã phòng ban khoa: ");
        this.maPBK = sc.nextLine();
        System.out.println("Nhập tên phòng ban khoa: ");
        this.tenPBK = sc.nextLine();
    }
}
