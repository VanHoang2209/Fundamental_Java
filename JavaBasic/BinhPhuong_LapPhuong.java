package JavaBasic;

public class BinhPhuong_LapPhuong {
    public static void main(String[] args) {
        System.out.println("Các giá trị bình phương: ");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "^2" + " = "+ i*i);
        }
        System.out.println("Các giá trị lập phương: ");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "^3" + " = "+ i*i*i);
        }
    }
}
