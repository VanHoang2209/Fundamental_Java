package OOP.BaiTapTrenLop.CD_Arraylist;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDCollection list = new CDCollection();
        CD cd = new CD();

        while(true){
            System.out.println("// ---CÁC CHỨC NĂNG-- //");
            System.out.println("1. Nhập danh sách CD");
            System.out.println("2. In danh sách CD");
            System.out.println("3. Nhập thông tin 1 CD");
            System.out.println("4. In thông tin 1 CD theo mã CD");
            System.out.println("5. In danh sách CD tăng dần theo mã CD");
            System.out.println("6. Thoát");

            int key = 0;
            System.out.print("Nhập lựa chọn của bạn: ");
            do {
                key = sc.nextInt();
                if (key < 1 || key > 6){
                    System.out.print("Lựa chọn không hợp lệ! Vui lòng nhập lại lựa chọn: ");
                }
            }while (key < 1 || key > 6);
            sc.nextLine();
            switch (key){
                case 1:
                    System.out.print("Nhập số lượng CD: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin CD thứ "+(i+1));
                        cd = CD.inputCD();
                        list.add(cd);
                    }
                    break;
                case 2:
                    System.out.println("// ----DANH SÁCH CD---- //");
                    list.output();
                    break;
                case 3:
                    System.out.println("Nhập thông tin cho 1 CD: ");
                    CD CDnew = CD.inputCD();
                    list.add(CDnew); ĐƯỢC SẮP XẾP TĂNG DẦN THEO MACD //");
                    list.output();
                    break;
                case 4:
                    System.out.print("Nhập mã CD cần in thông tin: ");
                    int maCD = sc.nextInt();
                    CD newSearch = list.search(maCD);
                    if (newSearch != null){
                        System.out.println(newSearch.toString());
                    }else {
                        System.out.println("Không tìm thấy thông tin CD có mã "+maCD);
                    }
                    break;
                case 5:
                    list.sapXepTang();
                    System.out.println("// DANH SÁCH CD
                    break;
                case 6:
                    exit(0);
            }
        }
    }
}
