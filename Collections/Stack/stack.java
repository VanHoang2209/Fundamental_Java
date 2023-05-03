package Collections.Stack;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

        // stackChuoi.push("giatri")     => đưa giá trị vào stack
        // stackChuoi.pop()              => lấy giá trị ra, xóa khỏi stack
        // stackChuoi.peek()             => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackChuoi.clear()            => xóa tất cả phần tử trong stack
        // stackChuoi.contains("giatri") => xác định giá trị có tồn tại trong stack hay không
        // stackChuoi.size()             => độ lớn của stack
        
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            stackChuoi.push(s.charAt(i) + "");
        }

        System.out.println("Chuỗi đảo ngược: ");
        for(int i=0; i<s.length(); i++){
            System.out.print(stackChuoi.pop());
        }

        // Chuyển từ số thập phân sang nhị phân

        Stack<String> stackSoDu = new Stack<String>();
        System.out.print("\nNhập vào 1 số nguyên: ");
        int n = sc.nextInt();

        while (n>0){
            int soDu = n%2;
            System.out.println(soDu);
            stackSoDu.push(soDu +"");
            n /= 2;
        }

        int x = stackSoDu.size();
        for(int i=0; i<x; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}
