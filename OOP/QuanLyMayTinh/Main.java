package OOP.QuanLyMayTinh;

public class Main {
    public static void main(String[] args) {
        QuocGia qg1 = new QuocGia("VN", "Viet Nam");
        QuocGia qg2 = new QuocGia("AS","American");

        HangSanXuat hsx1 =  new HangSanXuat("Asus",qg1);
        HangSanXuat hsx2 =  new HangSanXuat("Dell",qg2);

        NgaySanXuat n1 = new NgaySanXuat(22,9,2003);
        NgaySanXuat n2 = new NgaySanXuat(12,4,2005);

        MayTinh mt1 = new MayTinh(hsx1,n1,20500000,24);
        MayTinh mt2 = new MayTinh(hsx2,n2,10500000,12);

        System.out.println(hsx1.tenQGsx());
        System.out.println(hsx2.tenQGsx());

        System.out.println("(Gia ban) MT1 < MT2: "+mt1.KiemTraGiaThapHon(mt2));
        System.out.println("(Gia ban) MT1 < MT2: "+mt2.KiemTraGiaThapHon(mt1));
        
    }
}
