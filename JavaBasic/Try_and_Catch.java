package JavaBasic;

import java.util.Scanner;

public class Try_and_Catch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=0;
            try {
                System.out.println("Nhap vao so nguyen n: ");
                n = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Nhap du lieu khong dung");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Gia tri nhap lai la: "+n);
        System.out.println("Ket thuc chuong trinh");
    }
}
