package OOP.Abstract_Inherit;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    public XeOto(String loaiNhienLieu, HangSanXuat hangSX) {
        super(loaiNhienLieu,hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    @Override
    public double layVanToc(){
        return 60;
    }
}
