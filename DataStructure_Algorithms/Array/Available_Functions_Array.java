package DataStructure_Algorithms.Array;

import DataStructure_Algorithms.CompareTo.SinhVien;

import java.util.Arrays;

public class Available_Functions_Array {

    // Hàm đảo chiều mảng
    public static int[] reverse (int[] x){
        int n = x.length;
        for(int i=0; i<n/2; i++){
            int temp = x[i];
            x[i] = x[n-i-1];
            x[n-i-1] = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,5,7,3,2,9};
        int[] b = new int[15];

        // In ra mảng a
        System.out.println("Mảng a ban đầu: " + Arrays.toString(a)) ;

        //Hàm sắp xếp
        Arrays.sort(a);
        System.out.println("Mảng a sau khi được sắp xếp: " + Arrays.toString(a)) ;

        //Hàm tìm kiếm binarSearch phải được sắp xếp trước thì mới cho ra kết quả đúng
        System.out.println(Arrays.binarySearch(a,3));
        System.out.println(Arrays.binarySearch(a,-1));

        //Hàm điền giá trị
        Arrays.fill(b,5);
        System.out.println("Mảng b sau khi điền: " + Arrays.toString(b));

        // Hàm sắp xếp giảm dần
        Arrays.sort(a);
        a = Available_Functions_Array.reverse(a);
        System.out.println("Mảng a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
    }
}

