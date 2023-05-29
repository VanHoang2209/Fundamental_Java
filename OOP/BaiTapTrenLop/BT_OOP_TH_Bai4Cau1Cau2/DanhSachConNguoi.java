package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau1Cau2;

import OOP.BaiTapTrenLop.QuanLyHocVien.DanhSachNhanVien;

import java.util.ArrayList;

public class DanhSachConNguoi {
    ArrayList<ConNguoi> arrayList;
    public DanhSachConNguoi(){
        this.arrayList = new ArrayList<ConNguoi>();
    }

    public ArrayList<ConNguoi> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<ConNguoi> arrayList) {
        this.arrayList = arrayList;
    }
    public void add(ConNguoi conNguoi){
        this.arrayList.add(conNguoi);
    }
    public void remove(ConNguoi conNguoi){
        this.arrayList.remove(conNguoi);
    }
    public void outputNhanVien(){
        for (ConNguoi conNguoi : arrayList){
            if(conNguoi instanceof NhanVien){
                System.out.println(conNguoi.toString());
            }
        }
    }
    public void outputHocVien(){
        for (ConNguoi conNguoi : arrayList){
            if(conNguoi instanceof HocVien){
                System.out.println(conNguoi.toString());
            }
        }
    }

}
