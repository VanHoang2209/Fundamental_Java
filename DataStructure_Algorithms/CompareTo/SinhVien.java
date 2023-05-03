package DataStructure_Algorithms.CompareTo;

public class SinhVien implements Comparable<SinhVien> {
    private int maSv;
    private String hoTen;
    private String tenLop;
    private double diemTB;
    public SinhVien(int maSv, String hoTen, String tenLop, double diemTB){
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.diemTB = diemTB;
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public String getTen(){
        String s = this.hoTen.trim();
        if(s.indexOf(" ") >= 0){
            int pos = s.lastIndexOf(" ");
            return s.substring(pos + 1);
        }
        else {
            return s;
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv=" + maSv +
                ", hoTen='" + hoTen + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        // <0
        // =0
        // >0
        String tenThis = this.getTen();
        String tenO = o.getTen();
        // return this.maSv - o.maSv; => so sánh 2 mã sinh viên
         return tenThis.compareTo(tenO);
//        return (int) (this.diemTB - o.diemTB);
    }
}
