package OOP.BaiTapTrenLop.QuanLyHocVien;

import java.util.Scanner;

public class NhanVienQuanLy extends NhanVien {
    private double phuCapChucVu;
    private String chuyenMon;
    public NhanVienQuanLy(String maNV, String tenNV, int namSinh, String trinhDo, String truongDaoTao, double luongCoBan,double phuCapChucVu, String chuyenMon){
        super(maNV, tenNV, namSinh, trinhDo, truongDaoTao, luongCoBan);
        this.phuCapChucVu = phuCapChucVu;
        this.chuyenMon = chuyenMon;
    }
    public NhanVienQuanLy(){
        this.phuCapChucVu = 0.0f;
        this.chuyenMon = "";
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public double tinhLuong() {
        return (double) getLuongCoBan()+phuCapChucVu;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhập chuyên môn: ");
        this.chuyenMon = sc.nextLine();
        System.out.print("Nhập phụ cấp chức vụ: ");
        this.phuCapChucVu = sc.nextDouble();
    }

    public String toString() {
        return super.toString() + " NhanVienQuanLy{" +
                "phuCapChucVu=" + phuCapChucVu +
                ", chuyenMon='" + chuyenMon + '\'' +
                ", tinhLuong= " + tinhLuong()+
                '}';
    }
}
