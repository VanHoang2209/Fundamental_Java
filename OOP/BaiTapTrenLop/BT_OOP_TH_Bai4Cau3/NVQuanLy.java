package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLCao {
    private double phuCapCV;
    public NVQuanLy(String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa,
                    String trinhDo, String nganh, String noiDaoTao, double phuCapCV){
        super(ten,namSinh,luong,ngayNhanViec,phongBanKhoa,trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }
    public NVQuanLy(){
        super();
        this.phuCapCV = 0.0f;
    }
    public double getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(double phuCapCV) {
        this.phuCapCV = phuCapCV;
    }
    public void intputNVQL(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien quan ly: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap nam sinh nhan vien quan ly: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhap luong nhan vien quan ly: ");
        this.luong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap ngay nhan viec: ");
        this.ngayNhanViec = sc.nextLine();

        PhongBanKhoa pbk = new PhongBanKhoa();

        System.out.println("Nhap ma phong ban khoa: ");
        pbk.maPBk = sc.nextLine();
        System.out.println("Nhap ten phong ban khoa: ");
        pbk.tenPBK = sc.nextLine();

        System.out.println("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.println("Nhap nganh: ");
        this.nganh = sc.nextLine();
        System.out.println("Nhap noi dao tao: ");
        this.noiDaoTao = sc.nextLine();
        System.out.println("Nhap phu cap CV: ");
        this.phuCapCV = sc.nextDouble();
    }

    @Override
    public String toString() {
        PhongBanKhoa pbk = new PhongBanKhoa();
        return "NhanVienQuanLy{" +
                " ten= " + ten +
                ", namSinh= " + namSinh + '\'' +
                ", luong= " + luong +
                ", ngayNhanViec= " + ngayNhanViec +
                ", maPBK= " + pbk.maPBk +
                ", tenPBK= " + pbk.tenPBK +
                ", trinhDo= " + trinhDo +
                ", nganh= " + nganh +
                ", noiDaoTao= " + noiDaoTao + '\'' +
                ", phuCapCV= " + phuCapCV +
                '}';
    }

}
