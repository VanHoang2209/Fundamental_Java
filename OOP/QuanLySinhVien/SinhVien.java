package OOP.QuanLySinhVien;

public class SinhVien {
    private String maSv;
    private String hoTen;
    private NgaySinh date;
    private double diemTb;
    private Lop lop;
    public SinhVien(String maSv, String hoTen, NgaySinh date, double diemTb,Lop lop){
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.date = date;
        this.diemTb = diemTb;
        this.lop = lop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NgaySinh getDate() {
        return date;
    }

    public void setDate(NgaySinh date) {
        this.date = date;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public String TenKhoaSvHoc(){
        return this.lop.getTenKhoa();
    }
    public boolean SvCoDauHayKhong(){
        return this.diemTb >= 5;
    }
//    public boolean KiemTraNgaySinhSv (NgaySinh SvKhac){
//        return this.date == SvKhac.date;
//    }
}
