package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class HangTP extends HangHoa{
    private String ngaySX;
    private String ngayHh;
    public HangTP(String maHang, String tenHang, long donGia, String ngaySX, String ngayHh){
        super(maHang, tenHang, donGia);
        this.ngaySX = ngaySX;
        this.ngayHh = ngayHh;
    }
    public HangTP(){
        super();
        this.ngaySX = "";
        this.ngayHh = "";
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getNgayHh() {
        return ngayHh;
    }

    public void setNgayHh(String ngayHh) {
        this.ngayHh = ngayHh;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ngay san xuat: ");
        this.ngaySX = sc.nextLine();
        System.out.println("Nhap ngay het han: ");
        this.ngayHh = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + "HangTP{" +
                "ngaySX='" + ngaySX + '\'' +
                ", ngayHh='" + ngayHh + '\'' +
                '}';
    }
}
