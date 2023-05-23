package OOP.BaiTapTrenLop.QuanLySinhVien;

public class Nguoi {
    protected String soCMND;
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    public Nguoi(String soCMND, String hoTen, String ngaySinh, String diaChi){
        this.soCMND = soCMND;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public Nguoi() {
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
