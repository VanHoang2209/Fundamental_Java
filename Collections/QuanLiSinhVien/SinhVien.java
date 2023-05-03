package Collections.QuanLiSinhVien;

import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable { // Serializable : implement cái Interface này thì mới có thể ghi được sinh viên xuống tập tin
    private String maSV;
    private String hoTen;
    private int namSinh;
    private float diemTB;

    public SinhVien(String maSV){
            this.maSV = maSV;
        }
    public SinhVien(String maSV, String hoTen, int namSinh, float diemTB){
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diemTB = diemTB;
        }
        public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(SinhVien sv) {
        return this.maSV.compareTo(sv.maSV);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinhVien sinhVien)) return false;
        return Objects.equals(maSV, sinhVien.maSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV, hoTen, namSinh, diemTB);
    }
}
