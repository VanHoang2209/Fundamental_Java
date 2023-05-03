package OOP.NhapXuatThongTinXe;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static void nhapXe(Vehicle xe){
        Vehicle v = new Vehicle();
        System.out.println("Nhập mã xe: ");
        xe.setMaXe(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập họ tên chủ xe: ");
        xe.setHoTenChuXe(sc.nextLine());
        System.out.println("Nhập dung tích xe: ");
        xe.setDungTich(sc.nextInt());
        System.out.println("Nhập trị giá xe: ");
        xe.setTriGia(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhập mô tả xe: ");
        xe.setMoTa(sc.nextLine());
    }
    public static void main(String[] args) {
        int key,n=0;
        Vehicle v[] = null;
        boolean flag = true;
        while (flag){
            System.out.println("=============MENU=============");
            System.out.println("1. Tạo các đối tượng và nhập thông tin xe ");
            System.out.println("2. Xuất bản kê khai tiền thuế của các xe ");
            System.out.println("0. Thoát");
            System.out.printf("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();

            switch (key){
                case 1 :
                    System.out.println("Nhập số lượng xe muốn khai báo thuế");
                    n = sc.nextInt();
                    v = new Vehicle[n];
                    for(int i=0; i<n; i++){
                        System.out.printf("Xe thứ ",i+1);
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2 :
//                    System.out.printf("%d %s %d %df %s %df");
                    for(int i=0; i<n; i++){
                        v[i].inThue();
                    }
                case 0 :
                    System.out.println("Bye");
                    flag = false;
                    break;
            }
        }
    }
}
