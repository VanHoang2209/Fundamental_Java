package OOP.BaiTapTrenLop.HangHoa;

public class Main {
    public static void main(String[] args) {
        HangHoa hh1 = new HangDienMay("121","Tivi","Panasonic",15000000,"12 tháng",200,80);
        HangHoa hh2 = new HangThucPham("122","Mì tôm","Acecook",15000,"4/5/2023","4/5/2024");
        HangHoa hh3 = new HangSanhSu("123","Bát","Bát Tràng",10000,"Sứ");

        DanhSachHangHoa ds = new DanhSachHangHoa();
        ds.add(hh1);
        ds.add(hh2);
        ds.add(hh3);

        System.out.println();
        System.out.println("// Danh sách hàng hoá: ");
        ds.output();

        System.out.println();
        System.out.println("// Hàng điện máy: ");
        ds.outputHangDienMay();

        System.out.println();
        System.out.println("// Hàng thực phẩm: ");
        ds.outputHangThucPham();

        System.out.println();
        System.out.println("// Hàng sành sứ: ");
        ds.outputHangSanhSu();
    }
}
