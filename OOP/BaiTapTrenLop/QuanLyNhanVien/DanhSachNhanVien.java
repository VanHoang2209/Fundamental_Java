package OOP.BaiTapTrenLop.QuanLyNhanVien;

import java.util.ArrayList;

public class DanhSachNhanVien {
    ArrayList<NhanVien> arrayList;
    private String tenCongTy;
    public DanhSachNhanVien(String tenCongTy){
        this.arrayList = new ArrayList<NhanVien>();
        this.tenCongTy = tenCongTy;
    }

    public ArrayList<NhanVien> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<NhanVien> arrayList) {
        this.arrayList = arrayList;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public boolean add(NhanVien nv){
        return this.arrayList.add(nv);
    }
    public boolean remove(NhanVien nv){
        if(this.arrayList.contains(nv)){
            return this.arrayList.remove(nv);
        }
        return false;
    }
    public double maxLuong(){
        double max = 0.0f;
        for(NhanVien nv : arrayList){
            if(nv instanceof NhanVienBanHang){
                if(nv.maxLuong() > max){
                    max = nv.maxLuong();
                }
            }
        }
        return max;
    }
    public void output(){
        for (NhanVien nv : arrayList){
            if(nv instanceof NhanVienBanHang){
                System.out.println(nv.toString());
            }
            if (nv instanceof NhanVienVanPhong){
                System.out.println(nv.toString());
            }
        }
    }
}
