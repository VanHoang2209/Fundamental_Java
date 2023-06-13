package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected long donGia;
    public HangHoa(String maHang, String tenHang, long donGia){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    public HangHoa(){
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }
    public HangHoa(HangHoa other){
        this.maHang = other.maHang;
        this.tenHang = other.tenHang;
        this.donGia = other.donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = sc.nextLong();
    }
    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia + '\'';
    }
}
