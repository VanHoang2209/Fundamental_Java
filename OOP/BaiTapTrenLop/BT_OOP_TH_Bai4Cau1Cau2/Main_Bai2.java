package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachConNguoi danhSachConNguoi = new DanhSachConNguoi();
        ConNguoi conNguoi;

        while (true) {
            System.out.println("+---------------------------------------+");
            System.out.println("+ 1. Nhập 1 học viên                    +");
            System.out.println("+ 2. Nhập 1 nhân viên                   +");
            System.out.println("+ 3. Xuất thông tin danh sách học viên  +");
            System.out.println("+ 4. Xuất thông tin danh sách nhân viên +");
            System.out.println("+ 5. Thoát                              +");
            System.out.println("+---------------------------------------+");

            int key = 0;
            System.out.println("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    System.out.println("Bạn đã chọn nhập thông tin 1 học viên");
                    HocVien hocVien = new HocVien();
                    hocVien.intput();
                    danhSachConNguoi.add(hocVien);
                    break;
                case 2:
                    System.out.println("Bạn đã chọn nhập thông tin 1 nhân viên");
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.intput();
                    danhSachConNguoi.add(nhanVien);
                    break;
                case 3:
                    System.out.println("Bạn đã chọn xuất thông tin danh sách học viên");
                    danhSachConNguoi.outputHocVien();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn xuất thông tin danh sách nhân viên");
                    danhSachConNguoi.outputNhanVien();
                    break;
                case 5:
                    exit(0);
            }
        }
    }
}
