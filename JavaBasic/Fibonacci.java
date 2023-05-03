package JavaBasic;

public class Fibonacci {
    // Không sử dụng đệ quy
    public static long Day_So_Fibonacci(int n){
        long f0 = 0; // f0 = f(n - 2)
        long f1 = 1; // f1 = f(n - 1)
        long fn = 1; // fn = f(n)

        if(n < 0){
            return -1;
        }
        else if(n == 0 || n == 1){
            return n;
        }
        else{
            for(int i=2; i<=n; i++){
                fn = f0 + f1; // tính tổng r cập nhật lại f0 và f1
                f0 = f1;
                f1 = fn;
            }
        }
        return fn;
    }

    // Có sử dụng đệ quy
//    public static long Day_So_Fibonacci(int n){
//        if(n<0) return -1;
//        else if (n==0 || n==1) {
//            return n;
//        }
//        else {
//            return Day_So_Fibonacci(n-1) + Day_So_Fibonacci(n-2);
//        }
//    }


    public static void main(String[] args){
        for(int i=0; i<100; i++){
            System.out.println(Day_So_Fibonacci(i) + " ");
        }
    }
}
