package OOP.BaiTapTrenLop.CD;

import java.util.Scanner;

public class DanhSachCD {
    private CD[] dsCD;
    private int soLuongCD;
    public DanhSachCD(){
        dsCD = new CD[this.soLuongCD];
    }
    public DanhSachCD(int soLuongCD){
        this.dsCD = new CD[soLuongCD];
        this.soLuongCD = soLuongCD;
    }

    public CD[] getDsCD() {
        return dsCD;
    }

    public void setDsCD(CD[] dsCD) {
        this.dsCD = dsCD;
    }

    public int getSoLuongCD() {
        return soLuongCD;
    }

    public void setSoLuongCD(int soLuongCD) {
        this.soLuongCD = soLuongCD;
    }
    public void inputDsCD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng CD: ");
        this.soLuongCD = sc.nextInt();

        this.dsCD = new CD[this.soLuongCD];
        System.out.println("Nhập thông tin CD: ");
        for (int i = 0; i < this.soLuongCD; i++) {
            CD t = new CD();
            t.inputCD();
            dsCD[i] = t;
        }
    }
    public  void outputDsCD(){
        System.out.println("Số lượng CD: " + this.soLuongCD);
        System.out.println("Danh sách CD: ");
        for(CD cd : dsCD){
            cd.outputCD();
        }
    }
    public void sapXepGiam(){
        for (int i = 0; i < this.soLuongCD - 1; i++) {
            for (int j = i+1; j < this.soLuongCD; j++) {
                if(dsCD[i].getMaCD() < dsCD[j].getMaCD()){
                    CD t = dsCD[i];
                    dsCD[i] = dsCD[j];
                    dsCD[j] = t;
                }
            }
        }
    }
}
