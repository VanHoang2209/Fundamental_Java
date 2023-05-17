package OOP.BaiTapTrenLop.HangHoa;

public class HangDienMay extends HangHoa {
    private String thoiGianBaoHang;
    private double dienAp;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, String thoiGianBaoHang, double dienAp, double congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHang = thoiGianBaoHang;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public String getThoiGianBaoHang() {
        return thoiGianBaoHang;
    }

    public void setThoiGianBaoHang(String thoiGianBaoHang) {
        this.thoiGianBaoHang = thoiGianBaoHang;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return '{'+super.toString() +
                "thoiGianBaoHang='" + thoiGianBaoHang + '\'' +
                ", dienAp=" + dienAp +
                ", congSuat=" + congSuat +
                '}';
    }
}
