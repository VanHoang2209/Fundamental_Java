package OOP.BaiTapTrenLop.CD;

import java.util.Scanner;

public class CDDemo2 {
    public static void main(String[] args) {
        CD cd1 = new CD();
        cd1.inputCD();
        cd1.outputCD();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã CD cần thay đổi giá thành: ");
        int maCD = sc.nextInt();
        if(cd1.getMaCD() == maCD){
            System.out.print("Nhập giá thành muốn thay đổi: ");
            double giaThanhMoi = sc.nextDouble();
            cd1.setGia(giaThanhMoi);
            System.out.println("Đã thay đổi thành công giá thành của CD có mã" + maCD);
            cd1.outputCD();
        }else {
            System.out.println("Không tìm thấy CD có mã " + maCD);
        }

        System.out.println("Nhập thêm 1 CD");
        CD cd2 = new CD();
        cd2.inputCD();
        System.out.println("Thông tin của CD có số bài hát lớn hơn: ");
        if(cd1.getSoBaiHat() > cd2.getSoBaiHat()){
            cd1.outputCD();
        }else {
            cd2.outputCD();
        }

    }
}
