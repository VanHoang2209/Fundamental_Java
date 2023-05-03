package DataStructure_Algorithms.Array;

import java.util.Arrays;

public class Split_Array {
    public static void main(String[] args) {
        String s = "Xin chào các bạn, tôi là Văn Hoàng";

        // Hàm split cắt chuỗi
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println("Số phần tử mảng a: " +a.length);

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));
        System.out.println("Số phần tử mảng b: " +b.length);

        String s2 = "Xin chào, mình là Văn Hoàng. Mình là Lập trình viên";

        String[] c = s2.split("\\,|\\.");
        System.out.println(Arrays.toString(c));
        System.out.println("Số phần tử mảng c: "+c.length);

        String s3 = "Nguyễn Văn Hoàng";

        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Lấy tên: " + d[d.length-1]);
    }
}
