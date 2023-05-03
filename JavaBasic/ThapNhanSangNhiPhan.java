package JavaBasic;

import java.util.Scanner;

public class ThapNhanSangNhiPhan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
            do{
                System.out.println("Nhap n > 0: ");
                n = sc.nextInt();
            }while(n<=0);

            String nhiPhan = "";
        while(n > 0){
            nhiPhan = (n%2) + nhiPhan;
            n /= 2;
        }
        System.out.println("Gia tri nhi phan la: "+ nhiPhan);
    }
}
