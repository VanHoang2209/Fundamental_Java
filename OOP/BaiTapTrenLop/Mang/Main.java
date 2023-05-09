package OOP.BaiTapTrenLop.Mang;

public class Main {
    public static void main(String[] args) {
        Mang arr = new Mang(50);
        arr.setSoPhanTu(6);
        arr.nhapMang();
        arr.xuatMang();

        System.out.println();
        System.out.println("Trung bình các số lẻ trong mảng: "+arr.tbSoLe());
        System.out.println("Phần tử lớn nhất trong mảng: " + arr.maxMang());
        System.out.println("Sắp xếp mảng tăng dần: ");
        arr.sapXepMangTangDan();
        arr.xuatMang();
    }
}
