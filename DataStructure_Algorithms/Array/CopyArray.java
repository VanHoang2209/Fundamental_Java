package DataStructure_Algorithms.Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        // Kiểu nguyên thủy
        int[] mang = {1,2,3,4,5};

        // Copy mảng cách 1 => copy và làm ảnh hưởng phần tử của mảng chính
        int[] mang_1 = mang;
        mang_1[0] = 50;
        System.out.println("Mảng: " + Arrays.toString(mang));
        System.out.println("Mảng 1: " + Arrays.toString(mang_1));

        // Copy mảng cách 2 : sử dụng hàm clone() => copy và không làm ảnh hưởng phần tử ở mảng chính
        int[] mang_2 = mang.clone();
        mang_2[0] = 100;
        System.out.println("Mảng 2: " + Arrays.toString(mang_2));

        // Copy mảng cách 3: sử dụng hàm System.arraycopy => giống clone
        int[] mang_3 = new int[mang.length];
        System.arraycopy(mang,0,mang_3,0,mang.length);
        mang_3[0] = 150;
        System.out.println("Mảng 3: " + Arrays.toString(mang_3) );

        // Kiểu đối tượng
        String[] doi_tuong = {"Nguyễn" , "Văn" , "Hoàng"};
        //Copy mảng cách 1
        String[] doi_tuong_1 = doi_tuong;
        doi_tuong_1[0] = "Phạm";
        System.out.println("Mảng: " + Arrays.toString(doi_tuong));
        System.out.println("Mảng 1: " + Arrays.toString(doi_tuong_1));

        //Copy mảng cách 2 : sử dụng hàm clone()
        String[] doi_tuong_2 = doi_tuong.clone();
        doi_tuong_2[0] = "Trần";
        System.out.println("Mảng 2: " + Arrays.toString(doi_tuong_2));

        //Copy mảng cách 3:  sử dụng hàm System.arraycopy
        String[] doi_tuong_3 = new String[doi_tuong.length];
        System.arraycopy(doi_tuong_1,0,doi_tuong_3,0,doi_tuong.length);
        doi_tuong_3[0] = "Hồ";
        System.out.println("Mảng 3: " + Arrays.toString(doi_tuong_3));
    }
}
