package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import java.util.Scanner;

public class NhanVien extends ConNguoi {
    private double luong;
    private String ngayNhanViec;
    private PhongBanKhoa pbk;
    public NhanVien(String hoTen, int namSinh,double luong, String ngayNhanViec, PhongBanKhoa pbk){
        super(hoTen,namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }
    public NhanVien(){
        super();
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongBanKhoa getPbk() {
        return pbk;
    }

    public void setPbk(PhongBanKhoa pbk) {
        this.pbk = pbk;
    }
    public void intput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên nhân viên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh nhân viên: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhập lương nhân viên: ");
        this.luong = sc.nextDouble();
        System.out.println("Nhập ngày nhận việc: ");
        this.ngayNhanViec = sc.nextLine();
        pbk = new PhongBanKhoa();
        pbk.intputPBK();
    }

    @Override
    public String toString() {
        pbk = new PhongBanKhoa();
        return "NhanVien{" +
                " hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", maPBK = " + pbk.getMaPBK() +
                ". tenPBLK = " + pbk.getTenPBK() +
                ", luong=" + luong +
                ", ngayNhanViec='" + ngayNhanViec + '\'' +
                '}';
    }
}
