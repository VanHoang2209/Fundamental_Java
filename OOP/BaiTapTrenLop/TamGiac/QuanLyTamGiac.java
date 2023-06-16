package OOP.BaiTapTrenLop.TamGiac;

import java.util.ArrayList;

public class QuanLyTamGiac {
    ArrayList<TamGiac> list;
    QuanLyTamGiac(){
        list = new ArrayList<TamGiac>();
    }

    public ArrayList<TamGiac> getList() {
        return list;
    }
    public void add(TamGiac tg){
        this.list.add(tg);
    }
    public void remove(TamGiac tg){
        this.list.remove(tg);
    }
    public void output(){
        for (TamGiac tamGiac : list){
            System.out.println(tamGiac.toString());
        }
    }
}
