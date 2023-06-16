package OOP.BaiTapTrenLop.QuanLyNhanVien;

import java.util.Scanner;

public class NhanVienBanHang extends NhanVien{
    private int soSP;
    private double donGia;
    public NhanVienBanHang(int maNV, String hoTen, int soSP, double donGia){
        super(maNV,hoTen);
        this.soSP = soSP;
        this.donGia = donGia;
    }
    public NhanVienBanHang(){
        super();
        this.soSP = 0;
        this.donGia = 0.0f;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double maxLuong() {
        return (double) this.soSP * this.donGia;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                ", maNV=" + maNV +
                ", hoTen='" + hoTen + '\'' +
                "soSP=" + soSP +
                ", donGia=" + donGia +
                '}';
    }
}
