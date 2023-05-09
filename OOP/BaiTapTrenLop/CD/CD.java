package OOP.BaiTapTrenLop.CD;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private double gia;
    public CD(){
        this.maCD = 999999;
        this.tuaCD = "";
        this.soBaiHat = 0;
        this.gia = 0;
    }

    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }

    public void inputCD(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhập mã CD: ");
            this.maCD = sc.nextInt();
            if(this.maCD <= 0){
                System.out.println("Mã CD không hợp lệ! Nhập lại mã CD.");
            }
        }while (this.maCD <= 0);
        sc.nextLine();
        System.out.print("Nhập tựa CD: ");
        this.tuaCD = sc.nextLine();
        System.out.print("Nhập số bài hát: ");
        this.soBaiHat = sc.nextInt();
        System.out.print("Nhập giá CD: ");
        this.gia = sc.nextFloat();
    }

    public void outputCD(){
        System.out.println(maCD + "\t" + this.tuaCD + "\t" + soBaiHat + "\t" + gia);
    }
}
