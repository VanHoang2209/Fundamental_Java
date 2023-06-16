package OOP.BaiTapTrenLop.QuanLyNhanVien;
 abstract class NhanVien {
     protected int maNV;
     protected String hoTen;
     public NhanVien(int maNV, String hoTen){
         this.maNV = maNV;
         this.hoTen = hoTen;
     }
     public NhanVien(){
         this.maNV = 0;
         this.hoTen = "";
     }

     public int getMaNV() {
         return maNV;
     }

     public void setMaNV(int maNV) {
         this.maNV = maNV;
     }

     public String getHoTen() {
         return hoTen;
     }

     public void setHoTen(String hoTen) {
         this.hoTen = hoTen;
     }
     public abstract double maxLuong();

     @Override
     public String toString() {
         return "NhanVien{" +
                 "maNV=" + maNV +
                 ", hoTen='" + hoTen + '\'' +
                 '}';
     }
 }
