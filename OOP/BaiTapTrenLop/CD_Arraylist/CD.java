package OOP.BaiTapTrenLop.CD_Arraylist;

import java.util.Objects;
import java.util.Scanner;

public class CD {
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;
    public CD(int maCD, String tenCD, String caSy, int soBaiHat, double giaThanh){
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }
    public CD() {
        this.maCD = 0;
        this.tenCD = "";
        this.caSy = "";
        this.soBaiHat = 0;
        this.giaThanh = 0.0d;
    }

    public int getMaCD() {
        return maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tenCD='" + tenCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD cd)) return false;
        return maCD == cd.maCD && soBaiHat == cd.soBaiHat && Double.compare(cd.giaThanh, giaThanh) == 0 && Objects.equals(tenCD, cd.tenCD) && Objects.equals(caSy, cd.caSy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maCD, tenCD, caSy, soBaiHat, giaThanh);
    }
    public static CD inputCD(){
        CD cd = new CD();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhập tên CD: ");
        cd.setTenCD(sc.nextLine());

        System.out.print("Nhập ca sỹ: ");
        cd.setCaSy(sc.nextLine());

        System.out.print("Nhập số bài hát: ");
        cd.setSoBaiHat(sc.nextInt());

        System.out.print("Nhập giá thành: ");
        cd.setGiaThanh(sc.nextDouble());

        return  cd;
    }
}
