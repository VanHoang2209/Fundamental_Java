package OOP.QuanLyMayTinh;

public class MayTinh {
    private HangSanXuat hangSX;
    private NgaySanXuat ngaySX;
    private double giaBan;
    private double tgBaoHanh;
    public MayTinh(HangSanXuat hangSX, NgaySanXuat ngaySX, double giaBan, double tgBaoHanh){
        this.hangSX = hangSX;
        this.ngaySX = ngaySX;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }

    public HangSanXuat getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSanXuat hangSX) {
        this.hangSX = hangSX;
    }

    public NgaySanXuat getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(NgaySanXuat ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getTgBaoHanh() {
        return tgBaoHanh;
    }

    public void setTgBaoHanh(double tgBaoHanh) {
        this.tgBaoHanh = tgBaoHanh;
    }

    public boolean KiemTraGiaThapHon (MayTinh maytinhKhac){
        return this.giaBan < maytinhKhac.giaBan;
    }
}
