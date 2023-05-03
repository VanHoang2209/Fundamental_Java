package OOP.Abstract_Inherit;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, HangSanXuat hangSX) {
        super(loaiNhienLieu,hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public void catCanh(){
        System.out.println("Cat canh.....");
    }
    public void haCanh(){
        System.out.println("Ha canh......");
    }
    @Override
    public double layVanToc(){
        return 500;
    }
}
