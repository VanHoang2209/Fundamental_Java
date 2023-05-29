package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConNguoi conNguoi;
        HocVien hocVien = new HocVien();
        NhanVien nhanVien = new NhanVien();

        while (true){
            System.out.println("+-------------------------------+");
            System.out.println("+ 1. Nhập 1 học viên            +");
            System.out.println("+ 2. Nhập 1 nhân viên           +");
            System.out.println("+ 3. Xuất thông tin 1 học viên  +");
            System.out.println("+ 4. Xuất thông tin 1 nhân viên +");
            System.out.println("+ 5. Thoát                      +");
            System.out.println("+-------------------------------+");

            int key = 0;
            System.out.println("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            sc.nextLine();
            switch (key){
                case 1:
                    System.out.println("Bạn đã chọn nhập 1 học viên");
                    hocVien.intput();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn nhập 1 nhân viên");
                    nhanVien.intput();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn xuất 1 học viên");
                    System.out.println(hocVien.toString());
                    break;
                case 4:
                    System.out.println("Bạn đã chọn xuất 1 nhân viên");
                    System.out.println(nhanVien.toString());
                    break;
                case 5:
                    exit(0);
            }
        }
    }
}
