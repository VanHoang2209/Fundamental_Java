package OOP.BaiTapTrenLop.HangHoa;

public class HangSanhSu extends HangHoa {
    private String loaiNguyenLieu;

    public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                "loaiNguyenLieu='" + loaiNguyenLieu + '\'' +
                '}';
    }
}
