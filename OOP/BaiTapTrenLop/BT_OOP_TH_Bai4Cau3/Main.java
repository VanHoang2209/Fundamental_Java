package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSach list = new DanhSach();
        Nguoi nguoi;

        while (true) {
            System.out.println("+-----------------------------------------------+");
            System.out.println("+ 1. Nhap 1 hoc vien                            +");
            System.out.println("+ 2. Nhap 1 nhan vien quan ly                   +");
            System.out.println("+ 3. Nhap 1 giao vien                           +");
            System.out.println("+ 4. Xuat thong tin danh sach hoc vien          +");
            System.out.println("+ 5. Xuat thong tin danh sach nhan vien quan ly +");
            System.out.println("+ 6. Xuat thong tin danh sach giao vien         +");
            System.out.println("+ 7. Thoat                                      +");
            System.out.println("+-----------------------------------------------+");

            System.out.println("Nhap lua chon cua ban: ");
            int key = sc.nextInt();

            switch (key){
                case 1:
                    System.out.println("Ban da chon nhap 1 hoc vien ");
                    nguoi = new HocVien();
                    ((HocVien) nguoi).inputHV();
                    list.add(nguoi);
                    break;
                case 2:
                    System.out.println("Ban da chon nhap 1 nhan vien quan ly");
                    nguoi = new NVQuanLy();
                    ((NVQuanLy) nguoi).intputNVQL();
                    list.add(nguoi);
                    break;
                case 3:
                    System.out.println("Ban da chon nhap 1 giao vien");
                    nguoi = new GiaoVien();
                    ((GiaoVien) nguoi).intputGV();
                    list.add(nguoi);
                    break;
                case 4:
                    System.out.println("Ban da chon xuat thong tin danh sach hoc vien");
                    list.outputHV();
                    break;
                case 5:
                    System.out.println("Ban da chon xuat thong tin danh sach nhan vien quan ly");
                    list.outputNVQL();
                    break;
                case 6:
                    System.out.println("Ban da chon xuat thong tin danh sach giao vien");
                    list.outputGV();
                    break;
                case 7:
                    exit(0);
            }
        }
    }
}
