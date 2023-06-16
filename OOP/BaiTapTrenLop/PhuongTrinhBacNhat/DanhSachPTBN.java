package OOP.BaiTapTrenLop.PhuongTrinhBacNhat;

import java.util.ArrayList;

public class DanhSachPTBN {
    ArrayList<PhuongTrinhBacNhat> list;
    public DanhSachPTBN(){
        list = new ArrayList<PhuongTrinhBacNhat>();
    }

    public ArrayList<PhuongTrinhBacNhat> getList() {
        return list;
    }
    public void add(PhuongTrinhBacNhat ptbn){
        this.list.add(ptbn);
    }
    public void output(){
        for (PhuongTrinhBacNhat phuongTrinhBacNhat : list){
            System.out.println(phuongTrinhBacNhat.toString());
            double PTBN  = phuongTrinhBacNhat.giaiPTBN();
            System.out.println((double) PTBN);
        }
    }
}
