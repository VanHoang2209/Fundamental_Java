package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

public class NhanVien extends Nguoi {
    protected double luong;
    protected String ngayNhanViec;
    protected PhongBanKhoa phongBanKhoa;
    public NhanVien(String ten, int namSinh,double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa){
        super(ten,namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongBanKhoa = phongBanKhoa;
    }
    public NhanVien(){
        super();
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongBanKhoa getPhongBanKhoa() {
        return phongBanKhoa;
    }

    public void setPhongBanKhoa(PhongBanKhoa phongBanKhoa) {
        this.phongBanKhoa = phongBanKhoa;
    }
//    public void inputNV(){
//        PhongBanKhoa pbk = new PhongBanKhoa();
//        pbk.inputPBK();
//    }

//    @Override
//    public String toString() {
//        PhongBanKhoa pbk = new PhongBanKhoa();
//        return ", maPBK= " + pbk.getMaPBk() +
//                ", tenPBK= " + pbk.getTenPBK();
//    }
}
