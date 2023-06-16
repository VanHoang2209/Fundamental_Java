package OOP.BaiTapTrenLop.QuanLyNhanVien;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{
    private int soGio;
    private double donGia;
    public NhanVienVanPhong(int maNV, String hoTen, int soGio, double donGia){
        super(maNV, hoTen);
        this.soGio = soGio;
        this.donGia = donGia;
    }
    public NhanVienVanPhong(){
        super();
        this.soGio = 0;
        this.donGia = 0.0f;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double maxLuong() {
        return (double) this.soGio * this.donGia;
    }

    @Override
    public String toString() {
        return "NhanVienVanPhong{" +
                ", maNV=" + maNV +
                ", hoTen='" + hoTen + '\'' +
                "soGio=" + soGio +
                ", donGia=" + donGia +
                '}';
    }
}
