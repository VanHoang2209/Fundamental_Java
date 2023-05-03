package JavaBasic;

import java.util.Scanner;

public class Sum_k_in_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input column: ");
        int column = sc.nextInt();
        System.out.print("Input row: ");
        int row = sc.nextInt();
        int arr[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("a["+i+"]"+"["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.print("Input row you want to total: ");
        int k = sc.nextInt();
        int s=0;
        for (int i = 0; i < row; i++) {
            s += arr[k][i];
        }
        System.out.println("Sum of row " + k + " is: " + s);
    }
}
