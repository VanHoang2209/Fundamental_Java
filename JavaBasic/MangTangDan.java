package JavaBasic;

import java.util.Arrays;
import java.util.Scanner;

public class MangTangDan {
    public static void main(String[] args) {
        int arr[] = {7,79,9,1,45,2,100,4,55,6};
        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
