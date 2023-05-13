package OOP.BaiTapTrenLop.Staff_Manager;

public class QL_NhanVien {
    public static void main(String[] args) {
        DanhSachNhanVien nv = new DanhSachNhanVien();

        nv.inputDSNV();
        System.out.println("//// DSNV ////");
        nv.outputDSNV();

        System.out.println("//// Sắp xếp ////");
        nv.sapXepTheoLuong();
        nv.outputDSNV();

        System.out.println("//// Tìm tổng lương lớn nhất ////");
        nv.tongLuongLonNhat();
    }
}
