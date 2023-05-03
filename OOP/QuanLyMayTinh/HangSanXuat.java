package OOP.QuanLyMayTinh;

public class HangSanXuat {
    private String tenHang;
    private QuocGia QG;
    public HangSanXuat(String tenHang, QuocGia QG){
        this.tenHang = tenHang;
        this.QG = QG;
    }
    public String getTenHang(){
        return this.tenHang;
    }
    public void setTenHang(String tenHang){
        this.tenHang = tenHang;
    }
    public QuocGia getQG(){
        return this.QG;
    }
    public void setQG(QuocGia QG){
        this.QG = QG;
    }
    public String tenQGsx(){
        return this.QG.getTenQG();
    }
}
