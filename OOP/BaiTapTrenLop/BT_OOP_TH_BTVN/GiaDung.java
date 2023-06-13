package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class GiaDung extends HangDM{
    private int soLuong;
    public GiaDung(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, QuocGia madeIn, int soLuong){
        super(maHang, tenHang, donGia, thoiGianBH, dienAp, congSuat, madeIn);
        this.soLuong = soLuong;
    }
    public GiaDung(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, String noiSX, float thue, int trongLuong){
        super(maHang, tenHang, donGia, thoiGianBH, dienAp, congSuat, noiSX,thue);
        this.soLuong = getSoLuong();

    }
    public GiaDung(){
        super();
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so luong: ");
        this.soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "GiaDung{" +
                "soLuong=" + soLuong +
                '}';
    }
}
