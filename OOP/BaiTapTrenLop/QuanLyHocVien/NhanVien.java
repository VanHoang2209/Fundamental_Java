package OOP.BaiTapTrenLop.QuanLyHocVien;


import java.util.Scanner;

abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected int namSinh;
    protected String trinhDo;
    protected String truongDaoTao;
    protected double luongCoBan;
    public NhanVien(){
        this.maNV = "";
        this.tenNV = "";
        this.namSinh = 0;
        this.trinhDo = "";
        this.truongDaoTao = "";
        this.luongCoBan = 0.0f;
    }
    public NhanVien(String maNV, String tenNV, int namSinh, String trinhDo, String truongDaoTao, double luongCoBan){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
        this.truongDaoTao = truongDaoTao;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getTruongDaoTao() {
        return truongDaoTao;
    }

    public void setTruongDaoTao(String truongDaoTao) {
        this.truongDaoTao = truongDaoTao;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        this.maNV = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.tenNV  =sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập trình độ: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Nhập trường đào tạo: ");
        this.truongDaoTao = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        this.luongCoBan = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", namSinh=" + namSinh +
                ", trinhDo='" + trinhDo + '\'' +
                ", truongDaoTao='" + truongDaoTao + '\'' +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}
