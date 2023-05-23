package OOP.BaiTapTrenLop.QuanLySinhVien;

public class QuanLySinhVien {
    private SinhVien[] list;
    private int n;

    public QuanLySinhVien(){
        this.list = new SinhVien[100];
        this.n = 0;
    }

    public SinhVien[] getList() {
        return list;
    }

    public void setList(SinhVien[] list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void themSinhVien(SinhVien sv){
        if(this.n == list.length){
            tangKichThuoc();
        }
        list[n] = sv;
        n++;
    }
    public void tangKichThuoc(){
        SinhVien[] dsSvMoi = new SinhVien[list.length * 2];
        System.arraycopy(list,0,dsSvMoi,0,n);
        list =dsSvMoi;
    }
    public void xuatDSSV(){
        for (int i = 0; i < n; i++) {
            System.out.println(list[i].toString());
        }
    }
    public void timSV_Max_DTB(){
        if(n>0){
            SinhVien sinhVienCoDTBMax = list[0];
            for (int i = 0; i < n; i++) {
                if(list[i].diemTB() > sinhVienCoDTBMax.diemTB()){
                    sinhVienCoDTBMax = list[i];
                }
            }
            System.out.println("Sinh viên có diểm trung bình cao nhất: ");
            System.out.println(sinhVienCoDTBMax.toString());
        }else {
            System.out.println("Danh sách sv rỗng");
        }
    }
}
