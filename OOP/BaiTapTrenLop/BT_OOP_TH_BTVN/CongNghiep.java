package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class CongNghiep extends HangDM{
    private int trongLuong;
    public CongNghiep(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, QuocGia madeIn, int trongLuong){
        super(maHang, tenHang, donGia, thoiGianBH, dienAp, congSuat, madeIn);
        this.trongLuong = trongLuong;
    }
    public CongNghiep(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, String noiSX,float thue, int trongLuong){
        super(maHang, tenHang, donGia, thoiGianBH, dienAp, congSuat, noiSX, thue);
        this.trongLuong = trongLuong;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap trong luong: ");
        this.trongLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "CongNghiep{" +
                "trongLuong=" + trongLuong +
                '}';
    }
}
