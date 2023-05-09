package OOP.BaiTapTrenLop.CD;

public class QuanLiCD {
    public static void main(String[] args) {
        DanhSachCD dscd = new DanhSachCD();

        System.out.println("Nhập danh sách CD: ");
        dscd.inputDsCD();
        System.out.println("Xuất danh sách CD: ");
        dscd.outputDsCD();

        dscd.sapXepGiam();
        dscd.outputDsCD();
    }
}
