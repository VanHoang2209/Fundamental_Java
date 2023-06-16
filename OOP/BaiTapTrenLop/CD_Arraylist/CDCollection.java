package OOP.BaiTapTrenLop.CD_Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CDCollection {
    ArrayList<CD> list;
    private int soLuong;
    private double tongGiaThanh;

    public CDCollection() {
        this.list = new ArrayList<CD>();
        this.soLuong = 0;
        this.tongGiaThanh = 0.0d;
    }

    public ArrayList<CD> getList() {
        return list;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setList(ArrayList<CD> list) {
        this.list = list;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void add(CD cd){
        this.list.add(cd);
    }
    public void remove(CD cd){
        this.list.remove(cd);
    }
    public void output(){
        for (CD cd : list){
            System.out.println(cd.toString());
        }
    }
    public CD search(int maCD){
        for (CD cd : list){
            if(cd.getMaCD() == maCD){
                return cd;
            }
        }
        return null;
    }
    public void sapXepTang(){
        Collections.sort(this.list, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                if(cd1.getMaCD() < cd2.getMaCD()){
                    return -1;
                } else if (cd1.getMaCD() > cd2.getMaCD()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }
}
