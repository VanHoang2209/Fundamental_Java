package OOP.BaiTapTrenLop.PhuongTrinhBacNhat;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public PhuongTrinhBacNhat(int a, int b){
        this.a = a;
        this.b = b;
    }
    public PhuongTrinhBacNhat(PhuongTrinhBacNhat ptbn){
        this.a = ptbn.a;
        this.b = ptbn.b;
    }
    public double giaiPTBN(){
        if(this.a != 0){
            return (double) ((-1*this.b)/this.a);
        }else {
            return (double) this.b;
        }
    }

    @Override
    public String toString() {
        return "PhuongTrinhBacNhat{" + a + "x + " + b + " = 0}" ;
    }
}
