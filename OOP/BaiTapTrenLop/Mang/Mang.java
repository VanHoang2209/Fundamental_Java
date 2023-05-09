package OOP.BaiTapTrenLop.Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    private int soPhanTu;
    private int kichThuocMang;
    private int[] arr;
    public Mang(int kichThuocMang){
        this.soPhanTu = 0;
        this.arr = new int[kichThuocMang];
    }

    public int getSoPhanTu() {
        return soPhanTu;
    }
    public void setSoPhanTu(int soPhanTu) {
        this.soPhanTu = soPhanTu;
    }

    public int getKichThuocMang() {
        return kichThuocMang;
    }

    public void setKichThuocMang(int kichThuocMang) {
        this.kichThuocMang = kichThuocMang;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void nhapMang(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soPhanTu; i++) {
            this.arr[i] = sc.nextInt();
        }
    }
    public void xuatMang(){
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public double tbSoLe(){
        int s=0,d=0;
        double tb = 0;
        for (int i = 0; i < soPhanTu; i++) {
            if(this.arr[i] % 2 != 0){
                s += arr[i];
                d++;
            }
        }
        return tb = (double)s/d;
    }
    public int maxMang(){
        int max = 0;
        for (int i = 0; i < soPhanTu; i++) {
            if(this.arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public void sapXepMangTangDan(){
        for (int i = 0; i < soPhanTu; i++) {
            for (int j = i+1; j < soPhanTu; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
