package OOP.NhapXuatThongTinXe;

public class Vehicle {
    private int maXe;
    private int dungTich;
    private double triGia;
    private String hoTenChuXe;
    private String moTa;
    public Vehicle(){
    }
    public Vehicle(int maXe, int dungTich, double triGia, String hoTenChuXe, String moTa){
        this.maXe = maXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.hoTenChuXe = hoTenChuXe;
        this.moTa = moTa;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getHoTenChuXe() {
        return hoTenChuXe;
    }

    public void setHoTenChuXe(String hoTenChuXe) {
        this.hoTenChuXe = hoTenChuXe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public double tinhThue(){
        if(this.dungTich < 100){
            return (1/100) * this.triGia;
        }
        else if(this.dungTich >= 100 && this.dungTich <= 200){
            return (3/100)* this.triGia;
        }
        else if (this.dungTich > 200) {
            return (5/100) * this.triGia;
        }
        else
            return -1;
    }
    public void inThue(){
        System.out.printf("%d %s %d %df %s %df",maXe,hoTenChuXe,dungTich,triGia,moTa,tinhThue());
    }
}
