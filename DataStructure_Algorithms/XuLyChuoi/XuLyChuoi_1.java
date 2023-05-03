package DataStructure_Algorithms.XuLyChuoi;

import java.util.Scanner;

public class XuLyChuoi_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = sc.nextLine();
        System.out.println("-------------");

        //Hàm length()
        System.out.println("Độ dài của chuỗi: "+s.length());
        int doDai = s.length();

        //Hàm charAt() => lấy ra 1 kí tự từ vị trí
        for(int i=0; i<doDai; i++){
            System.out.println("Vị trí " + i + " là: "+ s.charAt(i));
        }

        //Hàm getChars(Vị trí bắt đầu, vị trí kết thúc, mảng dữ liệu, vị trí bắt đầu lưu của mảng)
        char[] arrayChar = new char[20];
        s.getChars(2,4,arrayChar,0); // giá trị end - 1
        for(int i=0; i<arrayChar.length; i++){
            System.out.println("Gía trị của mảng tại "+i+" là: "+arrayChar[i]);
        }

        //getBytes => có 3 cách, lấy ra giá trị của các kí tự thành 1 mảng
        byte[] arrayByte = s.getBytes();
        for(byte b: arrayByte){
            System.out.println(b);
        }
    }
}
