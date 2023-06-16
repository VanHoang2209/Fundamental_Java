package OOP.BaiTapTrenLop.Exception;

public class Main {
    public static void main(String[] args) throws IllegalAccessException,NullPointerException {
        mangInt arr = new mangInt(10);
        arr.nhapMang();
        arr.xuatMang();

        int giaTri = arr.layPhanTu(0);
        System.out.println("Giá trị phần ở vị trí 1: " +  giaTri);

        System.out.println("Sắp xếp mảng tăng");
        arr.sapXepMangTang();
        arr.xuatMang();

        System.out.println("Sắp xếp mảng giảm");
        arr.sapXepMangGiam();
        arr.xuatMang();

        arr.chenGiaTri(3,2);
        System.out.println("Mảng sau khi chèn giá trị 6 vào vị trí 3");
        arr.xuatMang();

    }
}