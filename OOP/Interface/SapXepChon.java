package OOP.Interface;

public class SapXepChon implements SapXep{
    @Override
    public void SapXepTang(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min_pos = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_pos]){
                    min_pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_pos];
            arr[min_pos] = temp;
        }
    }

    @Override
    public void SapXepGiam(int[] arr2) {
        int n = arr2.length;
        for(int i=0; i<n-1; i++){
            int max_pos = i;
            for(int j=i+1; j<n; j++){
                if(arr2[j] > arr2[max_pos]){
                    max_pos = j;
                }
            }
            int temp = arr2[i];
            arr2[i] = arr2[max_pos];
            arr2[max_pos] = temp;
        }
    }
}
