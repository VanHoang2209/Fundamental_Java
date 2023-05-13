package OOP.BaiTapTrenLop.Staff_Manager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("222","Nguyễn văn a",5000000,2.05);
        NhanVien nv3 = new NhanVien(nv1);
        nv3.setMaSo("333");
        nv3.setHoTen("Trần văn c");
        nv3.setLuongCoBan(4000000);
        nv3.setHeSoLuong(3.5);

        nv1.inputNV();
        nv1.outputNV();
        nv2.outputNV();
        nv3.outputNV();
        double nhanVien1 = nv1.luongNV();
        double nhanVien2 = nv2.luongNV();
        double nhanVien3 = nv3.luongNV();
        System.out.println("Lương nhân viên 1: "+nhanVien1);
        System.out.println("Lương nhân viên 2: "+nhanVien2);
        System.out.println("Lương nhân viên 3: "+nhanVien3);

        System.out.println("Nhập tên cần thay đổi của nhân viên 1: ");
        String tenMoi = sc.nextLine();
        nv1.setHoTen(tenMoi);
        nv1.outputNV();
    }

}