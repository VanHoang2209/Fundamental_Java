package JavaBasic;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        int maxArr = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        System.out.println("Max array = " + maxArr);
    }
}
