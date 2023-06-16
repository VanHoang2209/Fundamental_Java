package OOP.BaiTapTrenLop.HangHoa_Arraylist;

import java.util.ArrayList;

public class DanhSachHangHoa {
    ArrayList<HangHoa> list;
    public DanhSachHangHoa(){
        this.list = new ArrayList<HangHoa>();
    }
    public void add(HangHoa hh){
        this.list.add(hh);
    }
    public void remove(HangHoa hh){
        this.list.remove(hh);
    }
    public void output(){
        for(HangHoa hh : this.list){
            System.out.println(hh.toString());
        }
    }
    public void outputHangDienMay(){
        for(HangHoa hh : this.list){
            if(hh instanceof HangDienMay){
                System.out.println(hh.toString());
            }
        }
    }
    public void outputHangSanhSu(){
        for(HangHoa hh : this.list){
            if(hh instanceof HangSanhSu){
                System.out.println(hh.toString());
            }
        }
    }
    public void outputHangThucPham(){
        for(HangHoa hh : this.list){
            if(hh instanceof HangThucPham){
                System.out.println(hh.toString());
            }
        }
    }
}
