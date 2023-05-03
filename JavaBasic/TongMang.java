package JavaBasic;

import java.util.Random;

public class TongMang {
    public static void main(String[] args) {
        Random rd = new Random();
        int a[] = new int[10];
        for (int i = 0; i < 5; i++) {
            a[i] = rd.nextInt(10);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s += a[i];
        }
        System.out.println(s);
    }
}
