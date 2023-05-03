package OOP.Phim;

public class QuanLyBoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSx;
    private double giaVe;
    private NgayChieu date;
    public QuanLyBoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSx, double giaVe, NgayChieu date){
        this.tenPhim = tenPhim;
        if(namSanXuat >= 1){
            this.namSanXuat = namSanXuat;
        }
        this.hangSx = hangSx;
        this.giaVe = giaVe;
        this.date = date;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        if(this.namSanXuat >= 1){
            this.namSanXuat = namSanXuat;
        }
    }
    public HangSanXuat getHangSx() {
        return hangSx;
    }
    public void setHangSx(HangSanXuat hangSx) {
        this.hangSx = hangSx;
    }

    public NgayChieu getDate() {
        return date;
    }

    public void setDate(NgayChieu date) {
        this.date = date;
    }
    public boolean KiemTraGiaVe(QuanLyBoPhim PhimKhac){
        return this.giaVe < PhimKhac.giaVe;
    }
    public String TenHangPhim(){
        return this.hangSx.getTenHangSanXuat();
    }
    public double VeSauKhiGiamGia(double x){
        return this.giaVe*(1-x/100);
    }
}
