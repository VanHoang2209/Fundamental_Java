package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HangHoa hh;
        DanhSachHH ds = new DanhSachHH();
        ds.init();
        while (true) {
            try {
                System.out.println("");
                System.out.println("________________MENU__________________");
                System.out.println("1. Nhap 1 hang thuc pham");
                System.out.println("2. Nhap 1 hang dien may cong nghiep");
                System.out.println("3. Nhap 1 hang dien may gia dung");
                System.out.println("4. Xuat 1 hang thuc pham");
                System.out.println("5. Xuat 1 hang dien may cong nghiep");
                System.out.println("6. Xuat 1 hang dien may gia dung");
                System.out.println("7. Tim gia lon nhat");
                System.out.println("8. Sap xep tang theo ten");
                System.out.println("9. Sap xep giam theo gia");
                System.out.println("10.Xuat danh sach hang hoa");
                System.out.println("11. Nhap ten hang hoa can sua");
                System.out.println("______________________________________");
                System.out.println("Nhap lua chon cua ban: ");
                int key = sc.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("Ban chon nhap 1 mat hang thuc pham");
                        hh = new HangTP();
                        hh.nhap();
                        ds.add(hh);
                        break;
                    case 2:
                        System.out.println("Ban chon nhap 1 mat hang dien may cong nghiep");
                        hh = new CongNghiep("CN1", "Công nghiệp 1", 30000, 2, 20, 25, "Mỹ", 2.5f, 25);
                        hh.nhap();
                        ds.add(hh);
                        break;
                    case 3:
                        System.out.println("Ban chon nhap 1 mat hang dien may gia dung");
                        hh= new GiaDung();
                        hh.nhap();
                        ds.add(hh);
                        break;
                    case 4:
                        System.out.println("Ban chon xuat 1 mat hang thuc pham");
                        ds.xuatHangTP();
                        break;
                    case 5:
                        System.out.println("Ban chon xuat 1 mat hang dien may cong nghiep");
                        ds.xuatHangDMCN();
                        break;
                    case 6:
                        System.out.println("Ban chon xuat 1 mat hang dien may gia dung");
                        ds.xuatHangDMGD();
                        break;
                    case 7:
                        System.out.println("Hang hoa co gia tri cao nhat la: ");
                        ds.maxGia();
                        break;
                    case 8:
                        System.out.println("Sap xep tang theo ten: ");
                        ds.sapXepTheoTen();
                        ds.xuatDS();
                        break;
                    case 9:
                        System.out.println("Sap xep giam theo gia: ");
                        ds.sapXepTheoGia();
                        ds.xuatDS();
                        break;
                    case 10:
                        System.out.println("Xuat danh sach hang hoa: ");
                        ds.xuatDS();
                        break;
                    case 11:
                        System.out.println("Hang hoa can sua");
                        ds.sua();
                        ds.xuatDS();
                    case 0:
                        exit(0);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
