package JavaBasic;

import java.util.Scanner;

public class KiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 kí tự: ");
        char kiTu = sc.next().charAt(0);
        System.out.println("Mã số của "+kiTu+" là: "+(int)kiTu);
    }
}
