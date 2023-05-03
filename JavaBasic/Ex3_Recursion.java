package JavaBasic;

import java.util.Scanner;

public class Ex3_Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option){
            case 1:
                int n = sc.nextInt();
                System.out.println(Factorial(n));
                break;
            case 2:

            default:
                System.out.println("No option");
                break;
        }
    }
    public static long Factorial(int n){ //Giai thừa
        if(n < 2)
            return 1;
        return n * Factorial(n-1);
    }

}
