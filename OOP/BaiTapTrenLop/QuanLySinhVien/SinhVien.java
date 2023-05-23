package OOP.BaiTapTrenLop.QuanLySinhVien;

public class SinhVien extends Nguoi{
    private String mssv;
    private double diemLT, diemTH;
    public SinhVien(String mssv, String hoTen, String soCMND, String diaChi, String ngaySinh, double diemLT, double diemTH) {
        super();
        this.soCMND = soCMND;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mssv = mssv;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    public double diemTB(){
        return (this.diemLT + diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv='" + mssv + '\'' +
                ", ho ten: "+ this.getHoTen() +
                ", so CMND = " +this.getSoCMND() +
                ", dia chi: " + this.getDiaChi() +
                ", ngay sinh: " + this.getNgaySinh() +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
}
