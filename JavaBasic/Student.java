package JavaBasic;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        String id = sc.nextLine();
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input medium score: ");
        float mediumScore = sc.nextFloat();

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Medium Score: " + mediumScore);
    }
}
