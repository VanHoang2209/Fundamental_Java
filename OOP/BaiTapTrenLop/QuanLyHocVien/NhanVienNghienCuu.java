package OOP.BaiTapTrenLop.QuanLyHocVien;

import java.util.Scanner;

public class NhanVienNghienCuu extends NhanVien {
    private double phuCapDocHai;
    private String chuyenMon;
    public NhanVienNghienCuu(String maNV, String tenNV, int namSinh, String trinhDo, String truongDaoTao, double luongCoBan, double phuCapDocHai, String chuyenMon){
        super(maNV, tenNV, namSinh, trinhDo, truongDaoTao, luongCoBan);
        this.phuCapDocHai = phuCapDocHai;
        this.chuyenMon = chuyenMon;
    }
    public NhanVienNghienCuu(){
        this.phuCapDocHai = 0.0f;
        this.chuyenMon = "";
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public double tinhLuong() {
        return (double) getLuongCoBan()+this.phuCapDocHai;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập chuyên môn: ");
        this.chuyenMon = sc.nextLine();
        System.out.print("Nhập phụ cấp độc hại: ");
        this.phuCapDocHai = sc.nextDouble();
    }

    public String toString() {
        return super.toString()+ " NhanVienNghienCuu{" +
                "phuCapDocHai=" + phuCapDocHai +
                ", chuyenMon='" + chuyenMon + '\'' +
                ",tinhLuong= " + tinhLuong() +
                '}';
    }
}
