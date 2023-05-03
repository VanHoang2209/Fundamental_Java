package DataStructure_Algorithms.XuLyChuoi;

public class XuLyChuoi_3 {
    public static void main(String[] args) {
        String s1 = "Xin chào, Xin chào tất cả mọi người ";
        String s2 = "Xin chào";
        String s3 = "Xin chào tất cả mọi người";
        String s4 = "Hoàng";
        char c1 = 'ấ';

        //Hàm indexOf
        System.out.println("Vị trí cua s2 trong s1 là: " + s1.indexOf(s2));
        System.out.println("Vị trí cua s3 trong s1 là: " + s1.indexOf(s3));
        System.out.println("Vị trí cua s4 trong s1 là: " + s1.indexOf(s4));

        //Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 là: " + s1.indexOf(s2,2));

        //Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1));
        System.out.println("Vị trí của c1 trong s1 là: " + s1.indexOf(c1,25));

        //Hàm lastIndexOf => Tìm kiếm từ phải sang trái
        System.out.println("Vị trí cua s2 trong s1 từ phải sang trái : " + s1.lastIndexOf(s2));
    }
}
