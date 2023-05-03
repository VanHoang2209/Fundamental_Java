package OOP.Interface;
import java.util.Scanner;
public class SapXepChen implements SapXep{
    @Override
    public void SapXepTang(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int x = arr[i];
            int pos = i-1;
            while(pos >= 0 && x < arr[pos]){
                arr[pos + 1] = arr[pos];
                --pos;
            }
            arr[pos + 1] = x;
        }
    }

    @Override
    public void SapXepGiam(int[] arr2) {
        int n = arr2.length;
        for(int i=1; i<n; i++){
            int x = arr2[i];
            int pos = i-1;
            while(pos >= 0 && x > arr2[pos]){
                arr2[pos + 1] = arr2[pos];
                --pos;
            }
            arr2[pos + 1] = x;
        }
    }
}
