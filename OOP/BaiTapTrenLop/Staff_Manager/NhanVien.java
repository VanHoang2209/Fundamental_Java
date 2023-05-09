package OOP.BaiTapTrenLop.Staff_Manager;

public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    public NhanVien(String maSo,String hoTen,double luongCoBan,double heSoLuong){
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
