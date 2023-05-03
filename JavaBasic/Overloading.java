package JavaBasic;

import java.util.Arrays;

class Overloading {
    public int timMin(int a, int b){
        if(a<b){
            return a;
        }
        else {
            return b;
        }
    }
    public double timMin(double a, double b){
        if(a<b){
            return a;
        }
        else {
            return b;
        }
    }
    public double tinhTong(double a, double b){
        return a+b;
    }
    public double tinhTong(double[] arr){
        double tong=0;
        for(int i=0; i< arr.length;i++){
            tong += arr[i];
        }
        return tong;
    }
}
class run{
    public static void main(String[] args) {
        Overloading ov = new Overloading();
        System.out.println("Min(10,5) = "+ ov.timMin(10,5));
        System.out.println("Min(19.6,19.7) = "+ ov.timMin(19.6,19.7));
        System.out.println("Tong(10,5) = "+ ov.tinhTong(10,5));

        double arr[] = new double[] {4,5,6,7,8,9};
        System.out.println("Tong(arr) = " + ov.tinhTong(arr));
    }
}
