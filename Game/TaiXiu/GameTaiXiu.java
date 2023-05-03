package Game.TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class GameTaiXiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi","VN"); // en, US
//        NumberFormat num = NumberFormat.getInstance(lc);
        NumberFormat num = NumberFormat.getCurrencyInstance(lc);

        double taiKhoanNguoiChoi = 5000000;
        int option;
        while(true){
            System.out.print("\n--------------MENU TRÒ CHƠI---------------\n");
            System.out.print("----------Chọn (1) để bắt đầu chơi----------\n");
            System.out.print("----------Chọn (2) để xem hướng dẫn---------\n");
            System.out.print("----------Chọn (0) để thoát-----------------\n");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("*** Bắt đầu chơi: ");
                    System.out.println("***** Tài khoản của bạn: " + num.format(taiKhoanNguoiChoi) + ", bạn muốn đặt cược bao nhiêu?");

                    // Đặt cược
                    double datCuoc;
                    do{
                        System.out.println("Đặt cược: ");
                        datCuoc = sc.nextDouble();
                        if(datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi){
                            System.out.println("Số tiền đặt cược không hợp lệ !");
                            System.out.println("Vui lòng nhập lại......");
                        }
                    }while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                    // Chọn tài hay xỉu
                    int luaChonTaiXiu = 0;
                    do {
                        System.out.println("Chọn 1: Tài");
                        System.out.println("Chọn 2: Xỉu");
                        luaChonTaiXiu = sc.nextInt();
                        if(luaChonTaiXiu != 1 && luaChonTaiXiu != 2){
                            System.out.println("Lựa chọn của bạn không hợp lệ !");
                            System.out.println("Vui lòng nhập lại......");
                        }
                        if(luaChonTaiXiu == 1){
                            System.out.println("Bạn đã chọn Tài");
                        } else if (luaChonTaiXiu == 2) {
                            System.out.println("Bạn đã chọn Xỉu");
                        }
                    }while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                    //Xúc xắc
                    Random xucXac1 = new Random();
                    Random xucXac2 = new Random();
                    Random xucXac3 = new Random();

                    int giaTri1 = xucXac1.nextInt(5) +1;
                    int giaTri2 = xucXac1.nextInt(5) +1;
                    int giaTri3 = xucXac1.nextInt(5) +1;

                    System.out.println("Kết quả roll: "+giaTri1 + " "+giaTri2 + " " +giaTri3);
                    //Tính toán giá trị
                    int rs = giaTri1+giaTri2+giaTri3;
                    System.out.println("Kết quả: "+rs);

                    if(rs == 3 || rs == 18){
                        System.out.println("Nhà cái ăn: "+num.format(datCuoc));
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Số tiền hiện tại của bạn: "+num.format(taiKhoanNguoiChoi));
                    } else if (rs >= 4 && rs <= 10) {
                        System.out.println("Xỉu");
                        if(luaChonTaiXiu == 2){
                            System.out.println("BẠN ĐÃ THẮNG "+num.format(datCuoc));
                            taiKhoanNguoiChoi += datCuoc;
                            System.out.println("Số tiền hiện tại của bạn: "+num.format(taiKhoanNguoiChoi));
                        }
                        else{
                            System.out.println("BẠN ĐÃ THUA "+num.format(datCuoc));
                            taiKhoanNguoiChoi -= datCuoc;
                            System.out.println("Số tiền hiện tại của bạn "+num.format(taiKhoanNguoiChoi));
                        }
                    } else{
                        System.out.println("Tài");
                        if (luaChonTaiXiu == 1) {
                            System.out.println("BẠN ĐÃ THẮNG " +num.format(datCuoc));
                            taiKhoanNguoiChoi += datCuoc;
                            System.out.println("Số tiền hiện tại của bạn: " + num.format(taiKhoanNguoiChoi));
                        } else {
                            System.out.println("BẠN ĐÃ THUA " + num.format(datCuoc));
                            taiKhoanNguoiChoi -= datCuoc;
                            System.out.println("Số tiền hiện tại của bạn " + num.format(taiKhoanNguoiChoi));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền\n" +
                            "    ít hơn hoặc bằng số tiền họ đang có.\n" +
                            "*   Luật chơi như sau:\n" +
                            "    Có 3 viên xúc xắc. Mỗi viên xúc có 6 mặt có giá trị từ 1->6\n" +
                            "    Mỗi lần xúc xắc sẽ ra 1 kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá trị xx3\n" +
                            "    1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua\n" +
                            "    2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua\n" +
                            "    3. Nếu tổng = (11->17) <-> tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua");
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
