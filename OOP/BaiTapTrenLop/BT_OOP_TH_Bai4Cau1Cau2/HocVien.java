package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import java.util.Scanner;

public class HocVien extends ConNguoi {
    private float diemToan,diemLy, diemHoa;
    public HocVien(String hoTen, int namSinh,float diemToan,float diemLy, float diemHoa){
        super(hoTen,namSinh);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public HocVien(){
        super();
        this.diemToan = 0.0f;
        this.diemLy = 0.0f;
        this.diemHoa = 0.0f;
    }

    public float getDiem1() {
        return diemToan;
    }

    public void setDiem1(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiem2() {
        return diemLy;
    }

    public void setDiem2(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    public void intput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học viên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh học viên: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhập điểm Toán:  ");
        this.diemToan = sc.nextFloat();
        System.out.println("Nhập điểm Lý: ");
        this.diemLy = sc.nextFloat();
        System.out.println("Nhập điểm Hoá:  ");
        this.diemHoa = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "HocVien{" +
                " hoTen='" + hoTen +
                ", namSinh=" + namSinh +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }
}
