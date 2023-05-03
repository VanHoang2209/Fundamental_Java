package OOP.Abstract_Inherit;

public class main {
    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("Yamaha","Nhat Ban");
        HangSanXuat hsx2 = new HangSanXuat("Honda","Nhat Ban");
        HangSanXuat hsx3 = new HangSanXuat("VietNam Airlines","Viet Nam");

        PhuongTienDiChuyen pt1 = new XeDap(hsx1);
        PhuongTienDiChuyen pt2 = new XeOto("Xang",hsx2);
        PhuongTienDiChuyen pt3 = new MayBay("Xang may bay",hsx3);

        System.out.println("Ten hang san xuat: "+pt1.layTenHangSX());
        System.out.println("Bat dau: ");
        pt1.batDau();
        System.out.println("Dung lai: ");
        pt1.dungLai();
        System.out.println("Van toc: "+pt1.layVanToc()+ "km/h");

        System.out.println("Ten hang san xuat: "+pt2.layTenHangSX());
        System.out.println("Bat dau: ");
        pt1.batDau();
        System.out.println("Dung lai: ");
        pt1.dungLai();
        System.out.println("Van toc: "+pt2.layVanToc()+ "km/h");

        System.out.println("Ten hang san xuat: "+pt3.layTenHangSX());
        System.out.println("Bat dau: ");
        pt1.batDau();
        System.out.println("Dung lai: ");
        pt1.dungLai();
        System.out.println("Van toc: "+pt3.layVanToc()+ "km/h");

    }
}
