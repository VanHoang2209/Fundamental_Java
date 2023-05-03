package OOP;

public class HoaDonCaPhe1 {
    private String tenLoaiCaPhe;
    private double giaTien;
    private double khoiLuong;
    public HoaDonCaPhe1(String ten, double gia, double kl){
        this.tenLoaiCaPhe = ten;
        this.giaTien = gia;
        this.khoiLuong = kl;
    }
    public double tongTien(){
        return this.giaTien * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuong(double x){
//        if(this.khoiLuong > kl){
//            return true;
//        }
//        else
//            return false;
        return this.khoiLuong > x;
    }
    public boolean kiemTraTongTien(){

        return this.tongTien() > 500000;
    }
    public double tinhTienGiamGia(double x){
        if(this.tongTien() > 500000) {
            return (x / 100) * this.tongTien();
        }
        else {
            return 0;
        }
    }
    public double soTienKhachTra(double x){
        return this.tongTien() - this.tinhTienGiamGia(x);
    }
    public static void main(String[] args){
        HoaDonCaPhe1 hd1 = new HoaDonCaPhe1("Trung Nguyen",600000,1.5);
        System.out.println("Tong tien la: "+hd1.tongTien());
        System.out.println("Kiem tra khoi luong da ban co lon hon khoi luong nhap vao: "+hd1.kiemTraKhoiLuong(1.0));
        System.out.println("Kiem tra tong tien co lon hon 500000: "+hd1.kiemTraTongTien());
        System.out.println("So tien giam gia: "+hd1.tinhTienGiamGia(10));
        System.out.println("So tien khach phai tra sau khi giam gia: "+hd1.soTienKhachTra(20));
    }
}
