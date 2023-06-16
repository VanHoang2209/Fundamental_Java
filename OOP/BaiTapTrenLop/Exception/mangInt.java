package OOP.BaiTapTrenLop.Exception;

import java.util.Arrays;
import java.util.Scanner;

public class mangInt {
    private int[] arr;
    private int size;
    public mangInt(int maxSize){
        arr = new int[maxSize];
        this.size = 0;
    }
    public mangInt(int[] mangKhac){
        arr = Arrays.copyOf(mangKhac, mangKhac.length);
        size = mangKhac.length;
    }
    public void nhapMang() throws IllegalAccessException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        if(n <= 0){
            throw new IllegalAccessException("Số lượng phần tử không hợp lệ!");
        }
        else if(n > arr.length){
            throw new IllegalAccessException("Số lượng phần tử lớn hơn kích thước của mảng!");
        }
        arr = new int[n];
        size = n;
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }
    public int layPhanTu(int index){
        if(index >= 0 && index < size){
            return arr[index];
        }else {
            throw new IndexOutOfBoundsException("Giá trị không tồn tại");
        }
    }
    public void xuatMang() {
        System.out.println("-----------XUẤT MẢNG-------------");
        for (int i = 0; i < size; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }
    public void sapXepMangTang() throws IllegalAccessException,NullPointerException{
        if(arr == null){
            throw new NullPointerException("Mảng không tồn tại!");
        }
        if(size < 2){
            throw new IllegalAccessException("Mảng không đủ phần tử để sắp xếp");
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public void sapXepMangGiam() throws IllegalAccessException,NullPointerException{
        if(arr == null){
            throw new NullPointerException("Mảng không tồn tại!");
        }
        if(size < 2){
            throw new IllegalAccessException("Mảng không đủ phần tử để sắp xếp");
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i] < arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
    public void chenGiaTri(int giaTri, int index) {
        if (index >= 0 && index <= size) {
            if (size == arr.length) {
                kichThuocMangMoi();
            }
            for (int i = size; i > index; i--) {
                arr[i] =arr[i - 1];
            }
            arr[index] = giaTri;
            size++;
        } else {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ!");
        }
    }
    private void kichThuocMangMoi() {
        int[] newArray = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
    }
}
