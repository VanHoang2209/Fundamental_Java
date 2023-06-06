package OOP.BaiTapTrenLop.QuanLyHocVien;

import java.util.Scanner;

public class NhanVienPhucVu extends NhanVien {
    public NhanVienPhucVu(){}
    @Override
    public double tinhLuong() {
        return getLuongCoBan();
    }

}
