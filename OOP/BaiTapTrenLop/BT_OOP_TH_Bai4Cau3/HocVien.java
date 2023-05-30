package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.Scanner;

public class HocVien extends Nguoi {
    private float diemToan,diemLy,diemHoa;
    public HocVien(String ten, int namSinh,float diemToan, float diemLy, float diemHoa){
        super(ten,namSinh);
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

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }
    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void inputHV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hoc vien: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap nam sinh hoc vien: ");
        this.namSinh = sc.nextInt();
        System.out.println("Nhap diem Toan: ");
        this.diemToan = sc.nextFloat();
        System.out.println("Nhap diem Ly: ");
        this.diemLy = sc.nextFloat();
        System.out.println("Nhap diem Hoa: ");
        this.diemHoa = sc.nextFloat();
    }
    @Override
    public String toString() {
        return "HocVien{" +
                " ten='" + ten +
                ", namSinh=" + namSinh +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }
}
