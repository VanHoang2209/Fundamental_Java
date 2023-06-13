package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.Scanner;

public class HangDM  extends HangHoa{
    protected int thoiGianBH;
    protected int dienAp;
    protected int congSuat;
    protected QuocGia madeIn = new QuocGia();
    public HangDM(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, QuocGia madeIn){
        super(maHang, tenHang, donGia);
        this.thoiGianBH = thoiGianBH;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
        this.madeIn = madeIn;
    }
    public HangDM(String maHang, String tenHang, long donGia, int thoiGianBH, int dienAp, int congSuat, String noiSX, float thue){
        super(maHang, tenHang, donGia);
        this.thoiGianBH = thoiGianBH;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
        this.madeIn.setNoiSX(noiSX);
        this.madeIn.setThue(thue);
    }
    public HangDM(){
        super();
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap thoi gian bao hanh: ");
        this.thoiGianBH = sc.nextInt();
        System.out.println("Nhap dien ap: ");
        this.dienAp = sc.nextInt();
        System.out.println("Nhap cong suat: ");
        this.congSuat = sc.nextInt();
        madeIn.nhap();
    }

    @Override
    public String toString() {
        return super.toString() + "HangDM{" +
                "thoiGianBH=" + thoiGianBH +
                ", dienAp=" + dienAp +
                ", congSuat=" + congSuat +
                ", madeIn=" + madeIn.toString() +
                '}';
    }
}
