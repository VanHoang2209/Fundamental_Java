package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLCao {
    private double thuLaoGD;
    public GiaoVien(String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa,
                    String trinhDo, String nganh, String noiDaoTao, double thuLaoGD){
        super(ten,namSinh,luong,ngayNhanViec,phongBanKhoa,trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }
    public GiaoVien(){
        this.thuLaoGD = 0.0f;
    }

    public double getThuLaoGD() {
        return thuLaoGD;
    }

    public void setThuLaoGD(double thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }
    public void intputGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten giao vien: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap nam sinh giao vien: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhap luong giao vien: ");
        this.luong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap ngay nhan viec: ");
        this.ngayNhanViec = sc.nextLine();

//        PhongBanKhoa pbk = new PhongBanKhoa();
//        pbk.inputPBK();

        System.out.println("Nhap trinh do giao vien: ");
        this.trinhDo = sc.nextLine();
        System.out.println("Nhap nganh giao vien: ");
        this.nganh = sc.nextLine();
        System.out.println("Nhap noi dao tao: ");
        this.noiDaoTao = sc.nextLine();
        System.out.println("Nhap thu lao GD: ");
        this.thuLaoGD = sc.nextDouble();
    }

    @Override
    public String toString() {
        PhongBanKhoa pbk = new PhongBanKhoa();
        return "GiaoVien{" +
                " ten= " + ten +
                ", namSinh= " + namSinh + '\'' +
                ", luong= " + luong +
                ", ngayNhanViec= " + ngayNhanViec +
                ", maPhongBanKhoa= " + pbk.getMaPBk()  +
                ", tenPhongBanKhoa= " + pbk.getTenPBK() +
                ", trinhDo= " + trinhDo +
                ", nganh= " + nganh +
                ", noiDaoTao= " + noiDaoTao + '\'' +
                ", thuLaoGD= " + thuLaoGD +
                '}';
    }
}
