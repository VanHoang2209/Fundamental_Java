package OOP.BaiTapTrenLop.BT_OOP_TH_BTVN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachHH {
    ArrayList<HangHoa> listHangHoa;
    public DanhSachHH(){
        this.listHangHoa = new ArrayList<HangHoa>();
    }

    public ArrayList<HangHoa> getListHangHoa() {
        return listHangHoa;
    }

    public void setListHangHoa(ArrayList<HangHoa> listHangHoa) {
        this.listHangHoa = listHangHoa;
    }
    public boolean add(HangHoa hh){
        return this.listHangHoa.add(hh);
    }
    public boolean remove(HangHoa hh){
        if(this.listHangHoa.contains(hh)){
            return this.listHangHoa.remove(hh);
        }
        return false;
    }
    public void sua(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang can doi ten: ");
        String maHang = sc.nextLine();
        for (HangHoa hh : listHangHoa){
            if(hh.getMaHang().equals(maHang)){
                System.out.println("Nhap ten moi: ");
                String tenMoi = sc.nextLine();
                hh.setTenHang(tenMoi);
            }
        }
    }
    public void maxGia(){
        long max = listHangHoa.get(0).getDonGia();
        HangHoa hh = listHangHoa.get(0);
        for (int i = 0; i < listHangHoa.size(); i++) {
            if (max > listHangHoa.get(i).getDonGia()){
                max = listHangHoa.get(i).getDonGia();
                hh = listHangHoa.get(i);
            }
        }
        System.out.println(hh);
    }

    public void sapXepTheoTen(){
        Collections.sort(listHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa hh1, HangHoa hh2) {
                return hh1.getTenHang().compareToIgnoreCase(hh2.getTenHang());
            }
        });
    }
    public void sapXepTheoGia(){
        Collections.sort(listHangHoa, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa hh1, HangHoa hh2) {
                if(hh1.getDonGia() > hh2.getDonGia()){
                    return -1;
                } else if (hh1.getDonGia() < hh2.getDonGia()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }
    public void xuatDS(){
        for (HangHoa hh : listHangHoa){
            System.out.println(hh.toString());
        }
    }
    public void xuatHangDMCN(){
        for (HangHoa hh : listHangHoa){
            if(hh instanceof CongNghiep){
                System.out.println(hh.toString());
            }
        }
    }
    public void xuatHangDMGD(){
        for (HangHoa hh : listHangHoa){
            if(hh instanceof GiaDung){
                System.out.println(hh.toString());
            }
        }
    }
    public void xuatHangTP(){
        for (HangHoa hh : listHangHoa){
            if(hh instanceof HangTP){
                System.out.println(hh.toString());
            }
        }
    }
    public void init(){
        listHangHoa.add(new HangDM("DM1","Tivi",50000,1,20,20,"Viêt Nam",1.5f));
        listHangHoa.add(new HangTP("TP1","Táo",3000,"5/5/2023","7/5/2023"));
        listHangHoa.add(new CongNghiep("CN1","Công nghiệp 1",30000,2,20,25,"Mỹ",2.5f,25));
        listHangHoa.add(new GiaDung("GD1","Gia dụng 1",25000,1,22,23,"Trung",1.2f,21));
        listHangHoa.add(new HangDM("DM2","Máy tính",51200,1,14,20,"Lào",2.3f));
        listHangHoa.add(new HangTP("TP2","Xoài",3555,"14/2/2023","15/2/2023"));
        listHangHoa.add(new CongNghiep("CN2","Công nghiệp 2",123312,2,21,12,"Pháp",3.5f,11));
        listHangHoa.add(new GiaDung("GD2","Gia dụng 2",33211,1,15,44,"Hàn",1.4f,22));
    }
}
