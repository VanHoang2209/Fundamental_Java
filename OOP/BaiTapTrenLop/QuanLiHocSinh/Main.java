package OOP.BaiTapTrenLop.QuanLiHocSinh;

public class Main {
    public static void main(String[] args) {
        DanhSachHocSinh ds = new DanhSachHocSinh();
        ds.nhapDSHS();
        ds.xuatDSHS();
        System.out.println("/// Danh sách học sinh giảm dần theo điểm trung bình: ");
        ds.sapXepGiamDanTheoDTB();
        ds.xuatDSHS();
    }
}
