package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

import java.util.ArrayList;

public class DanhSach {
    ArrayList<Nguoi> arrayList;
    public DanhSach(){
        this.arrayList = new ArrayList<Nguoi>();
    }

    public ArrayList<Nguoi> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Nguoi> arrayList) {
        this.arrayList = arrayList;
    }
    public boolean add(Nguoi nguoi){
        return this.arrayList.add(nguoi);
    }
    public boolean remove(Nguoi nguoi){
        if(this.arrayList.contains(nguoi)){
            return this.arrayList.remove(nguoi);
        }
        return false;
    }
    public void outputGV(){
        for(Nguoi nguoi : arrayList){
            if(nguoi instanceof GiaoVien ){
                System.out.println(nguoi.toString());
            }
        }
    }
    public void outputHV(){
        for (Nguoi nguoi : arrayList){
            if(nguoi instanceof HocVien){
                System.out.println(nguoi.toString());
            }
        }
    }
    public void outputNVQL(){
        for (Nguoi nguoi : arrayList){
            if(nguoi instanceof NVQuanLy){
                System.out.println(nguoi.toString());
            }
        }
    }
}
