package OOP.Phim;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("cinestar", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("BHD", "My");

        NgayChieu n1 = new NgayChieu(22, 12, 2022);
        NgayChieu n2 = new NgayChieu(23, 3, 2000);

        QuanLyBoPhim p1 = new QuanLyBoPhim("Sieu lay gap sieu lua", 2010, h1, 50000, n1);
        QuanLyBoPhim p2 = new QuanLyBoPhim("Avatar", 2008, h2, 150000, n2);

        System.out.println("Kiem tra gia ve: "+p1.KiemTraGiaVe(p2));
        System.out.println("Ten hang phim cua phim "+p1.getTenPhim()+" la: "+p1.TenHangPhim());
        System.out.println("Gia ve sau khi duoc giam gia 10% " + p1.VeSauKhiGiamGia(10));
    }
}
