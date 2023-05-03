package DataStructure_Algorithms.CompareTo;

public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123,"Nguyen Van B","21DTHC6",9.9);
        SinhVien sv2 = new SinhVien(124,"Pham Quang Huy Sinh","21DTHA1",8.8);
        SinhVien sv3 = new SinhVien(125,"Tran Van A","21DTHD1",7.7);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv3.compareTo(sv1));
    }
}
