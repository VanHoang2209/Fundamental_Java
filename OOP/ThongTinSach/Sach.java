package OOP.ThongTinSach;

public class Sach{
    private String tenSach;
    private double giaBan;
    private int namXB;
    private TacGia tg;
    public Sach(String tenSach, double giaBan, int namXB, TacGia tg){
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        if(namXB >= 1){
            this.namXB = namXB;
        }
        this.tg = tg;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public double getgiaBan(){
        return giaBan;
    }
    public void setgiaBan(double giaBan){
        this.giaBan = giaBan;
    }
    public int getNamXB(){
        return namXB;
    }
    public void setNamXB(int namXB){
        if(namXB >=1 ){
            this.namXB = namXB;
        }
    }
    public TacGia getTg() {
        return tg;
    }
    public void setTg(TacGia tg) {
        this.tg = tg;
    }

    public void in1QS(){
        System.out.println(this.tenSach);
    }
    public boolean kiemTraNamXB (Sach sachKhac){
        return this.namXB == sachKhac.namXB;
    }
    public double sachSauGiamGia (double x){
        return this.giaBan*(1-x/100);
    }
}
