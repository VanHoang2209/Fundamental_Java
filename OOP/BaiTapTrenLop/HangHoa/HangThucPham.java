package OOP.BaiTapTrenLop.HangHoa;

public class HangThucPham extends HangHoa{
    private String ngaySanXuat;
    private String hanSuDung;

    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, String ngaySanXuat, String hanSuDung) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                "ngaySanXuat='" + ngaySanXuat + '\'' +
                ", hanSuDung='" + hanSuDung + '\'' +
                '}';
    }
}
