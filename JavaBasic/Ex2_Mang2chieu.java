package JavaBasic;

import java.util.Scanner;
public class Ex2_Mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, c;
        int[][] a;
        int[][] b;
        int[][] tong;
        d = sc.nextInt();
        c = sc.nextInt();
        a = new int[d][c];
        b = new int[d][c];
        tong = new int[d][c];
        NhapMangA(a, d, c);
        XuatMangA(a, d, c);
        NhapMangB(b, d, c);
        XuatMangB(b, d, c);
        Tong2MaTran(tong, a, b, d, c);

        KtraMaTranThua(a, d, c);
    }

    public static void NhapMangA(int[][] a, int d, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void XuatMangA(int[][] a, int d, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void NhapMangB(int[][] b, int d, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    public static void XuatMangB(int[][] b, int d, int c) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void Tong2MaTran(int[][] tong, int[][] a, int[][] b, int d, int c) {
        System.out.println("Tong 2 ma tran la: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                tong[i][j] = a[i][j] + b[i][j];
                System.out.print(tong[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void KtraMaTranThua(int[][] a, int d, int c) {
        int Soptu0 = 0;
        int SoptuKhac0 = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 0) {
                    Soptu0++;
                } else SoptuKhac0++;
            }
        }
        if (Soptu0 > SoptuKhac0) {
            System.out.println("Ma tran A la ma tran thua");
        } else System.out.println("Ma tran A khong phai la ma tran thua");
    }
}
