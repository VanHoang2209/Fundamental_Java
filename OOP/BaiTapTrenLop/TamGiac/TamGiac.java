package OOP.BaiTapTrenLop.TamGiac;

import static java.lang.Math.*;

public class TamGiac {
    private int a;
    private int b;
    private int c;
    public TamGiac(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double chuVi(){
        return this.a + this.b + this.c;
    }
    public double dienTich(){
        double p = (double)chuVi()/2;
        return (double)Math.sqrt(p*(p-this.a) * (p-this.b) * (p-this.c));
    }
    public String loaiTamGiac(){
        if (a == b && b == c){
            return "Tam giác đều";
        } else if (a == b || b == c || c == a) {
            return "Tam giác cân";
        } else if (a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a+b*b) {
            return "Tam giác vuông";
        }else{
            return  "Tam giác thường";
        }
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Loại tam giác: " + loaiTamGiac() +
                '}';
    }
}
