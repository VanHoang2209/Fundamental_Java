package OOP.BaiTapTrenLop.QuanLyNhanVien;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        NhanVien nvbh1 = new NhanVienBanHang(123,"Nguyễn Sỹ A",100,15000);
        NhanVien nvvp = new NhanVienVanPhong(122,"Nguyễn Văn B",80,20000);

        DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien("Samsung");
        danhSachNhanVien.add(nvbh1);
        danhSachNhanVien.add(nvvp);

        danhSachNhanVien.output();
        System.out.println("Lương lớn nhất của nhân viên bán hàng: " + danhSachNhanVien.maxLuong());

    }
}
