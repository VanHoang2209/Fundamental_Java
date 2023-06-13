package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class QuocGia {
    private String noiSX;
    private float thue;
    public QuocGia(String noiSX, float thue){
        this.noiSX = noiSX;
        this.thue = thue;
    }
    public QuocGia(){

    }

    public String getNoiSX() {
        return noiSX;
    }

    public void setNoiSX(String noiSX) {
        this.noiSX = noiSX;
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap noi san xuat: ");
        this.noiSX = sc.nextLine();
        do {
            System.out.println("Nhap thue (%): ");
            this.thue = sc.nextFloat();
            if(this.thue < 0 || this.thue > 100){
                System.out.println("Nhap sai gia tri thue! Yeu cau nhap lai...");
            }
        }while (this.thue < 0 || this.thue > 100);
    }
    @Override
    public String toString() {
        return "QuocGia{" +
                "noiSX='" + noiSX + '\'' +
                ", thue=" + thue +
                '}';
    }
}
