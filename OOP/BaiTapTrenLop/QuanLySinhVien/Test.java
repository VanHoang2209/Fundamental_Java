package OOP.BaiTapTrenLop.QuanLySinhVien;

public class Test {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        SinhVien sv1 = new SinhVien("121","Nguyễn Bá A","1122334455","Bắc Ninh","12/2/2022",7.8,8.0);
        SinhVien sv2 = new SinhVien("122","Nguyễn Văn B","1122334466","Quảng Bình","13/3/2023",7.6,8.5);
        SinhVien sv3 = new SinhVien("123","Nguyễn C","1122334477","Hà Nội","11/1/2021",7.5,9.0);

        quanLySinhVien.themSinhVien(sv1);
        quanLySinhVien.themSinhVien(sv2);
        quanLySinhVien.themSinhVien(sv3);

        quanLySinhVien.xuatDSSV();

        quanLySinhVien.timSV_Max_DTB();
    }
}
