package OOP.BaiTapTrenLop.PhuongTrinhBacNhat;

public class Demo {
    public static void main(String[] args) {
        DanhSachPTBN list = new DanhSachPTBN();

        PhuongTrinhBacNhat phuongTrinhBacNhat1 = new PhuongTrinhBacNhat(3,4);
        PhuongTrinhBacNhat phuongTrinhBacNhat2 = new PhuongTrinhBacNhat(2,6);
        PhuongTrinhBacNhat ptbn = new PhuongTrinhBacNhat(8,1);
        PhuongTrinhBacNhat phuongTrinhBacNhat3 = new PhuongTrinhBacNhat(ptbn);

        list.add(phuongTrinhBacNhat1);
        list.add(phuongTrinhBacNhat2);
        list.add(phuongTrinhBacNhat3);

        list.output();
    }
}
