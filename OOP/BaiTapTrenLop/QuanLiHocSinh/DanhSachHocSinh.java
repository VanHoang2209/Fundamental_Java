package OOP.BaiTapTrenLop.QuanLiHocSinh;

import OOP.BaiTapTrenLop.Staff_Manager.NhanVien;

import java.util.Scanner;

public class DanhSachHocSinh {
    private HocSinh[] list;
    private int soLuong;
    public DanhSachHocSinh(){
        this.list = new HocSinh[soLuong];
    }

    public HocSinh[] getList() {
        return list;
    }

    public void setList(HocSinh[] list) {
        this.list = list;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void nhapDSHS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh: ");
        this.soLuong = sc.nextInt();
        list = new HocSinh[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập học sinh thứ "+(i+1) + ": ");
            HocSinh hs = new HocSinh();
            hs.input();
            list[i] = hs;
        }
    }
    public void xuatDSHS(){
        for (int i = 0; i < soLuong; i++) {
            list[i].output();
        }
    }
    public void sapXepGiamDanTheoDTB(){
        for (int i = 0; i < soLuong-1; i++) {
            for (int j = i+1; j < soLuong; j++) {
                if(list[i].getdiemTb() < list[j].getdiemTb()){
                    HocSinh t = list[i];
                    list[i] = list[j];
                    list[j] = t;
                }
            }
        }
    }
}
