package JavaBasic;

import java.util.Scanner;

public class MaKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các phần tử trong mảng: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng kí tự: ");
        for (int i = 0; i < n; i++) {
            System.out.println((char)arr[i] + " ");
        }
        System.out.println("Mã lần lượt của các kí tự: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
