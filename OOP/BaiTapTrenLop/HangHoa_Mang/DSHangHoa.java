package OOP.BaiTapTrenLop.HangHoa_Mang;

import OOP.BaiTapTrenLop.HangHoa_Arraylist.HangHoa;

import java.util.Scanner;

public class DSHangHoa {
    private HangHoa[] list;
    int n;
    public DSHangHoa(){
        this.list = new HangHoa[10];
        this.n=0;
    }

    public HangHoa[] getList() {
        return list;
    }

    public void setList(HangHoa[] list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void themHangHoa(HangHoa hangHoa){
        if(n < list.length){
            list[n] = hangHoa;
            n++;
        }else {
            System.out.println("Danh sach hang hoa da day!");
        }
    }
    public void nhapHangHoa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang hoa: ");
        String maHang = sc.nextLine();
        System.out.println("Nhap ten hang hoa: ");
        String tenHang = sc.nextLine();
        System.out.println("Nhap nha san xuat: ");
        String nhaSanXuat = sc.nextLine();
        System.out.println("Nhap gia: ");
        double gia = sc.nextDouble();
        sc.nextLine();

        System.out.println("Nhap loai hang: ");
        String loaiHang = sc.nextLine();
        if(loaiHang.equals("dien may")){
            System.out.println("Nhap thoi gian bao hang: ");
            String thoiGianBH = sc.nextLine();
            System.out.println("Nhap dien ap: ");
            double dienAp = sc.nextDouble();
            System.out.println("Nhap cong suat: ");
            double congSuat = sc.nextDouble();

            HangDienMay hangDienMay = new HangDienMay(maHang,tenHang,nhaSanXuat,gia,thoiGianBH,dienAp,congSuat);
            themHangHoa(hangDienMay);
        } else if (loaiHang.equals("thuc pham")) {
            System.out.println("Nhap ngay san xuat: ");
            String ngaySX = sc.nextLine();
            System.out.println("Nhap han su dung: ");
            String hanSD = sc.nextLine();

            HangThucPham hangThucPham = new HangThucPham(maHang,tenHang,nhaSanXuat,gia,ngaySX,hanSD);
            themHangHoa(hangThucPham);
        }
    }
    public void xuatDanhSachTheoLoai(String loaiHangHoa){
        System.out.println("Danh sach hang hoa theo " + loaiHangHoa);
        for (int i = 0; i < this.n; i++) {
            if(list[i] instanceof HangDienMay && loaiHangHoa.equals("dien may")){
                System.out.println(list[i]);
            } else if (list[i] instanceof HangThucPham && loaiHangHoa.equals("thuc pham")) {
                System.out.println(list[i]);
            }
        }
    }
}
