package OOP.NhapXuatThongTinSinhVien;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    public SinhVien(){
    }
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float DiemTB (){
        return (this.diemLT+this.diemTH)/2;
    }
    public void in1SV (){
       System.out.printf("%6d %-18s %10.2f %12.2f %12.2f \n", maSV, hoTen, diemLT,diemTH , DiemTB());
    }
}
