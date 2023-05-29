package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

public class ConNguoi {
    protected String hoTen;
    protected int namSinh;
    public ConNguoi(String hoTen, int namSinh){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
    public ConNguoi(){
        this.hoTen = "";
        this.namSinh = 0;
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
}
