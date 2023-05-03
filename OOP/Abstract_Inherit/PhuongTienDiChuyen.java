package OOP.Abstract_Inherit;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSX;
    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSX){
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSX = hangSX;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSanXuat hangSX) {
        this.hangSX = hangSX;
    }

    public String layTenHangSX(){
        return loaiPhuongTien;
    }
    public void batDau(){
        System.out.println("Bat dau.....");
    }
    public void tangToc(){
        System.out.println("Tang toc.....");
    }
    public void dungLai(){
        System.out.println("Dung lai.....");
    }
    public abstract double layVanToc();

}
