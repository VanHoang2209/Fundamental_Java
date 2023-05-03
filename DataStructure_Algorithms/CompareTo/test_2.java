package DataStructure_Algorithms.CompareTo;

import java.util.Arrays;

public class test_2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123,"Nguyen Van B","21DTHC6",9.9);
        SinhVien sv2 = new SinhVien(124,"Pham Quang Huy Sinh","21DTHA1",8.8);
        SinhVien sv3 = new SinhVien(125,"Tran Van A","21DTHD1",7.7);
        SinhVien sv4 = new SinhVien(126,"Tran Quang Vinh","21DTHE5",6.6);

        SinhVien[] array_sv = new SinhVien[] {sv1,sv2,sv3};

        System.out.println("Mảng sinh viên: " + Arrays.toString(array_sv));

        //Hàm sắp xếp
        Arrays.sort(array_sv);
        System.out.println("Mảng sau khi dược sắp xếp: " + Arrays.toString(array_sv));

        //Hàm tìm kiếm
        System.out.println(Arrays.binarySearch(array_sv,sv2)); // phải truyền vào đối tượng chứ kh phải truyền vào 1 cái tên
        System.out.println(Arrays.binarySearch(array_sv,sv4));
    }
}
