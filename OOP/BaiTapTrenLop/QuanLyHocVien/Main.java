package OOP.BaiTapTrenLop.QuanLyHocVien;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv;
        DanhSachNhanVien list = new DanhSachNhanVien();

        while(true){
            System.out.println("+-------------------------------------------------+");
            System.out.println("+ 1. Nhập nhân viên quản lý                       +");
            System.out.println("+ 2. Nhập nhân viên nghiên cứu                    +");
            System.out.println("+ 3. Nhập nhân viên phục vụ                       +");
            System.out.println("+ 4. In danh sách nhân viên                       +");
            System.out.println("+ 5. In bảng lương nhân viên theo thứ tự tăng dần +");
            System.out.println("+ 6. Thoát                                        +");
            System.out.println("+-------------------------------------------------+");

            int key = 0;
            System.out.println("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            sc.nextLine();

            switch (key){
                case 1:
                    System.out.println("Bạn đã chọn nhập 1 nhân viên quản lý");
                    nv = new NhanVienQuanLy();
                    nv.input();
                    list.add(nv);
                    break;
                case 2:
                    System.out.println("Bạn đã chọn nhập 1 nhân viên nghiên cứu");
                    nv = new NhanVienNghienCuu();
                    nv.input();
                    list.add(nv);
                    break;
                case 3:
                    System.out.println("Bạn đã chọn nhập 1 nhân viên phục vụ");
                    nv = new NhanVienPhucVu();
                    nv.input();
                    list.add(nv);
                    break;
                case 4:
                    list.output();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn in bảng lương theo thứ tự tăng dần");
                    list.inBangLuongTangDan();
                    list.output();
                    break;
                case 6:
                    exit(0);
            }
        }
    }
}
