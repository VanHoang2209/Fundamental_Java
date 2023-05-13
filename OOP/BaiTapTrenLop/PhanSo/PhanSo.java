package OOP.BaiTapTrenLop.PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(){
    }
    public PhanSo(int tuSo, int mauSo){
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
    public PhanSo Cong2ps(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi,mauSoMoi);
    }
    public PhanSo Tru2ps (PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi,mauSoMoi);
    }
    public PhanSo Nhan2ps (PhanSo ps){
        int tuSoMoi = this.tuSo * ps.tuSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi,mauSoMoi);
    }
    public PhanSo Chia2ps(PhanSo ps){
        int tuSoMoi = this.tuSo * ps.mauSo;
        int maSoMoi = this.mauSo * ps.tuSo;
        return new PhanSo(tuSoMoi,maSoMoi);
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
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhập phân số thứ nhất: ");
        ps1.nhapPhanSo();
        System.out.println("Nhập phân số thứ hai: ");
        ps2.nhapPhanSo();
        ps1.inPhanSo();
        ps2.inPhanSo();


        PhanSo cong = ps1.Cong2ps(ps2);
        PhanSo tru = ps1.Tru2ps(ps2);
        PhanSo nhan = ps1.Nhan2ps(ps2);
        PhanSo chia = ps1.Chia2ps(ps2);

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
