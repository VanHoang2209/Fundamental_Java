package OOP.BaiTapTrenLop.PhanSo;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

public class Phan_So {
    private int tuSo;
    private int mauSo;
    public Phan_So(){
    }
    public Phan_So(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo = sc.nextInt();
        do{
            System.out.print("Nhập mẫu số: ");
            this.mauSo = sc.nextInt();
            if(this.mauSo == 0){
                System.out.println("Mẫu số phải khác 0. Yêu cầu nhập lại!");
            }
        }while(this.mauSo == 0);
    }
    public void inPhanSo(){
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
    public Phan_So Cong2ps(Phan_So ps){
        int tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new Phan_So(tuSoMoi,mauSoMoi);
    }
    public Phan_So Tru2ps (Phan_So ps){
        int tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new Phan_So(tuSoMoi,mauSoMoi);
    }
    public Phan_So Nhan2ps (Phan_So ps){
        int tuSoMoi = this.tuSo * ps.tuSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new Phan_So(tuSoMoi,mauSoMoi);
    }
    public Phan_So Chia2ps(Phan_So ps){
        int tuSoMoi = this.tuSo * ps.mauSo;
        int maSoMoi = this.mauSo * ps.tuSo;
        return new Phan_So(tuSoMoi,maSoMoi);
    }
    public void ToiGian2ps(){
        int UCLN = UCLN(this.tuSo,this.mauSo);
        this.tuSo /= UCLN;
        this.mauSo /= UCLN;
    }
    public int UCLN(int a, int b){
        if(b == 0){
            return a;
        }
        return UCLN(b,a%b);
    }

    public static void main(String[] args) {
        Phan_So ps1 = new Phan_So();
        Phan_So ps2 = new Phan_So();
        System.out.println("Nhập phân số thứ nhất: ");
        ps1.nhapPhanSo();
        System.out.println("Nhập phân số thứ hai: ");
        ps2.nhapPhanSo();
        ps1.inPhanSo();
        ps2.inPhanSo();


        Phan_So cong = ps1.Cong2ps(ps2);
        Phan_So tru = ps1.Tru2ps(ps2);
        Phan_So nhan = ps1.Nhan2ps(ps2);
        Phan_So chia = ps1.Chia2ps(ps2);

        System.out.print("Cộng 2 phân số: ");
        cong.ToiGian2ps();
        cong.inPhanSo();

        System.out.print("Trừ 2 phân số: ");
        tru.ToiGian2ps();
        tru.inPhanSo();

        System.out.print("Nhân 2 phân số: ");
        nhan.ToiGian2ps();
        nhan.inPhanSo();

        System.out.print("Chia 2 phân số: ");
        chia.ToiGian2ps();
        chia.inPhanSo();

        System.out.println("2 phân số tối giản: ");
        ps1.ToiGian2ps();
        ps2.ToiGian2ps();
        ps1.inPhanSo();
        ps2.inPhanSo();
    }
}
