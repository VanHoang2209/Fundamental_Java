package OOP.Interface;

public class PhanMemMayTinhBoTui implements MayTinhBoTui,SapXep {
    @Override
    public double cong(double a, double b) {
        return a+b;
    }

    @Override
    public double tru(double a, double b) {
        return a-b;
    }

    @Override
    public double nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double chia(double a, double b) {
        return a/b;
    }

    // Sắp xếp tăng của Insertion
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

    //Sắp xếp giảm của Selection
    @Override
    public void SapXepGiam(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int max_pos = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[max_pos]){
                    max_pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_pos];
            arr[max_pos] = temp;
        }
    }
}
