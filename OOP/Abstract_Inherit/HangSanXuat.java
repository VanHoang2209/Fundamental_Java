package OOP.Abstract_Inherit;

public class HangSanXuat {
    private String tenHangSX;
    private String tenQG;
    public HangSanXuat(String tenHangSX, String tenQG){
        this.tenHangSX = tenHangSX;
        this.tenQG = tenQG;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getTenQG() {
        return tenQG;
    }

    public void setTenQG(String tenQG) {
        this.tenQG = tenQG;
    }
}
