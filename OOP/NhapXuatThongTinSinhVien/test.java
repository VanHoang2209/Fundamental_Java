package OOP.NhapXuatThongTinSinhVien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết sinh viên 1: ");
        sv1.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành sinh viên 1: ");
        sv1.setDiemTH(sc.nextFloat());

        System.out.println("==============================");

        SinhVien sv2 = new SinhVien();
        System.out.println("Nhap mã sinh viên 2: ");
        sv2.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setHoTen(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết sinh viên 2: ");
        sv2.setDiemLT(sc.nextFloat());
        System.out.println("Nhập điểm thực hành sinh viên 2: ");
        sv2.setDiemTH(sc.nextFloat());

//        System.out.println("==============================");
//
//        SinhVien sv3 = new SinhVien();
//        System.out.println("Nhap mã sinh viên 2: ");
//        sv3.setMaSV(sc.nextInt());
//        sc.nextLine();
//        System.out.println("Nhập tên sinh viên 2: ");
//        sv3.setHoTen(sc.nextLine());
//        System.out.println("Nhập điểm lý thuyết sinh viên 2: ");
//        sv3.setDiemLT(sc.nextFloat());
//        System.out.println("Nhập điểm thực hành sinh viên 2: ");
//        sv3.setDiemTH(sc.nextFloat());

        //in theo format
        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");

        sv1.in1SV();
        sv2.in1SV();
//        sv3.in1SV();
    }
}
