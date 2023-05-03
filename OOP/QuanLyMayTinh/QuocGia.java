package OOP.QuanLyMayTinh;

public class QuocGia {
    private String maQG;
    private String tenQG;
    public QuocGia(String maQG, String tenQG){
        this.maQG = maQG;
        this.tenQG = tenQG;
    }

    public String getMaQG() {
        return maQG;
    }
    public void setMaQG(String maQG){
        this.maQG = maQG;
    }
    public String getTenQG(){
        return this.tenQG;
    }
    public void setTenQG(String tenQG){
        this.tenQG = tenQG;
    }
}
