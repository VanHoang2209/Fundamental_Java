package OOP.BaiTapTrenLop.Staff_Manager;

import java.util.Scanner;

public class DanhSachNhanVien {
    private NhanVien[] nv;
    private int soLuong;
    public DanhSachNhanVien(){
    }
    public DanhSachNhanVien(int soLuong){
        nv = new NhanVien[soLuong];
        this.soLuong = soLuong;
    }
    public DanhSachNhanVien(NhanVien[] nv, int soLuong){
        this.nv = nv;
        this.soLuong = soLuong;
    }

    public NhanVien[] getNv() {
        return nv;
    }

    public void setNv(NhanVien[] nv) {
        this.nv = nv;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void inputDSNV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        this.soLuong  = sc.nextInt();
        nv = new NhanVien[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1) +": ");
            NhanVien nhanVien = new NhanVien();
            nhanVien.inputNV();
            nv[i] = nhanVien;
        }
    }
    public void outputDSNV(){
        System.out.println("Số lượng nhân viên: " + this.soLuong);
        for (int i = 0; i < soLuong; i++) {
            nv[i].outputNV();
        }
    }
    public void sapXepTheoLuong(){
        for (int i = 0; i < this.soLuong; i++) {
            for (int j = i + 1; j < this.soLuong; j++) {
                if (nv[i].luongNV() > nv[j].luongNV()) {
                    NhanVien t = nv[i];
                    nv[i] = nv[j];
                    nv[j] = t;
                }
            }
        }
    }
    public void tongLuongLonNhat(){
        NhanVien nhanVienCoLuongLonNhat = nv[0];
        for (int i = 0; i < soLuong; i++) {
            if(nv[i].luongNV() > nhanVienCoLuongLonNhat.luongNV()){
                nhanVienCoLuongLonNhat = nv[i];
            }
        }
        nhanVienCoLuongLonNhat.outputNV();
    }

}
