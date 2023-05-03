package JavaBasic;

import java.util.Scanner;

public class Ex1_Mang1chieu {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        n = sc.nextInt();
        a = new int[n];

        NhapMang(a, n);
        XuatMang(a, n);
        System.out.println("\n" + "Max array = " + Max(a, n));
        System.out.println("Min array = " + Min(a, n));

        System.out.println("\nCac SNT trong mang la: ");

        for (int i = 0; i < n; i++) {
            if (KtraSNT(a[i])) {
                System.out.println(a[i]);
            }
        }

        System.out.println("\nMang tang dan: ");
        SapXepTang(a, n);
        XuatMang(a, n);
    }

    public static void NhapMang(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void XuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int Max(int[] a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int Min(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static boolean KtraSNT(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void SapXepTang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
