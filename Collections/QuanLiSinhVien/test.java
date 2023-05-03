package Collections.QuanLiSinhVien;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.exit;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int key;
        while(true){
            System.out.println("------------MENU ---------- ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "10.  Lưu danh sách sinh viên xuống tập tin. \n"
                            + "11.  Đọc danh sách sinh viên từ tập tin. \n"
                            + "0.   Thoát khỏi chương trình");
            System.out.println("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            sc.nextLine();
            switch (key){

                // Thêm 1 sinh viên vào danh sách
                case 1:
                    System.out.println("- Nhập mã số sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("- Nhập họ và tên sinh viên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("- Nhập năm sinh sinh viên: ");
                    int ns = sc.nextInt();
                    System.out.println("- Nhập điểm trung bình sinh viên: ");
                    float dtb = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSinhVien,hoVaTen,ns,dtb);
                    dssv.themSinhVien(sv);
                    break;

                // In danh sách sinh viên ra màn hình
                case 2:
                    dssv.inDanhSachSV();
                    break;

                // Kiểm tra danh sách rỗng
                case 3:
                    System.out.println("Danh sách rỗng: " + dssv.kiemTraDSRong());
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên trong danh sách: " + dssv.soLuongSV());
                    break;
                case 5:
                    dssv.lamRong();
                    break;
                case 6:
                    System.out.println("- Nhập mã số sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new SinhVien(maSinhVien);
                    System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraSVCoTonTai(sv));
                    break;
                case 7:
                    System.out.println("- Nhập mã số sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new SinhVien(maSinhVien);
                    System.out.println("Xóa 1 sinh viên ra khỏi danh sách: " + dssv.xoa1SV(sv));
                    break;
                case 8:
                    System.out.println("- Nhập họ và tên sinh viên: ");
                    hoVaTen = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    dssv.timKiemSV(hoVaTen);
                    break;
                case 9:
                    dssv.sapXepSVGiamTheoDiem();
                    dssv.inDanhSachSV();
                    break;
                case 10:
                    System.out.println("Nhập tên file: ");
                    String tenFile = sc.nextLine();
                    File f = new File(tenFile);
                    dssv.GhiDuLieuXuongFile(f);
                    break;
                case 11:
                    System.out.println("Nhập tên file: ");
                    String nameFile = sc.nextLine();
                    File nf = new File(nameFile);
                    dssv.DocDuLieuTuFile(nf);
                    break;
                case 0:
                    exit(0);
            }
        }
    }
}
