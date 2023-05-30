package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

public class Nguoi {
    protected String ten;
    protected int namSinh;
    public Nguoi(String ten, int namSinh){
        this.ten  = ten;
        this.namSinh = namSinh;
    }
    public Nguoi(){
        this.ten = "";
        this.namSinh =0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

}
