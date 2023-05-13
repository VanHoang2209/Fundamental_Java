package OOP.BaiTapTrenLop.Staff_Manager;
import java.util.Scanner;
public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    public NhanVien(){
        this.maSo ="";
        this.hoTen ="";
        this.luongCoBan = 0.0f;
        this.heSoLuong = 0.0f;
    }
    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    public NhanVien(NhanVien nv){
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCoBan = nv.luongCoBan;
        this.heSoLuong = nv.heSoLuong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void inputNV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số: ");
        this.maSo = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        this.luongCoBan = sc.nextDouble();
        System.out.println("Nhập hệ số lương: ");
        this.heSoLuong = sc.nextDouble();
    }
    public double luongNV(){
        return this.luongCoBan * this.heSoLuong;
    }
    public void outputNV(){
        System.out.println(maSo + "\t" + hoTen + "\t" + luongCoBan + "\t" + heSoLuong + "\t" + luongNV());
    }
}