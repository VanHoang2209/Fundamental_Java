package OOP.BaiTapTrenLop.QuanLiHocSinh;
import java.util.Scanner;
public class HocSinh {
    private String maSo;
    private String hoTen;
    private double diemTb;
    public HocSinh(){
        String maSo = "";
        String hoTen = "";
        double diemTb = 0;
    }
    public String getmaSo(){
        return maSo;
    }
    public void setmaSo(String maSo){
        this.maSo = maSo;
    }
    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public double getdiemTb(){
        return diemTb;
    }
    public void setdiemTb(double diemTb){
        this.diemTb = diemTb;
    }

    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.hoTen = sc.nextLine();

        do {
            System.out.print("Nhập diểm trung bình: ");
            this.diemTb = sc.nextDouble();
            if(this.diemTb > 10){
                System.out.println("Nhập lại điểm trung bình");
            }
        } while (this.diemTb > 10);
    }
    public void output(){
        System.out.println(maSo + "\t" + hoTen + "\t" + diemTb);
    }

}
