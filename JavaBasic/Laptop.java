package JavaBasic;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String chuoi;
        chuoi = sc.nextLine();
        char kitu;
        for(int i=0; i<=chuoi.length(); i++){
            kitu = chuoi.charAt(i);
            System.out.println(kitu);
        }
    }
}
