package OOP.BaiTapTrenLop.QuanLyHocVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachNhanVien {
    ArrayList<NhanVien> arrayList;

    public DanhSachNhanVien() {
        this.arrayList = new ArrayList<NhanVien>();
    }

    public ArrayList<NhanVien> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<NhanVien> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(NhanVien nv){
        this.arrayList.add(nv);
    }
    public void remove(NhanVien nv){
        this.arrayList.remove(nv);
    }
//    public void tieuDe(){
//        System.out.printf("| %-4s | %-25s | %-20s | %-10s | %-20s | %-25s | %-15s | %8s | %-18s | %10s | ",
//                "Mã","Họ tên","Năm sinh","Trình độ","Trường đào tạo","Chuyên môn","Luong cơ bản","Phụ cấp chức vụ","Phụ cấp độc hại");
//        System.out.println();
//    }
//    public void output(){
//        tieuDe();
//        for (NhanVien nv : arrayList){
//            if(nv instanceof NhanVienQuanLy){
//                System.out.printf("| %-4s | %-25s | %-20s | %-10s | %-20s | %-25s | %-15s | %-12s | %-18s | %-15d |",
//                        nv.getMaNV(),nv.getTenNV(),nv.getNamSinh(),nv.getTrinhDo(),nv.getTruongDaoTao(),nv.getChuyenMon(),"Nhân viên quản lý",nv.getLuongCoBan(),((NhanVienQuanLy) nv).getPhuCapChucVu(),"null");
//                System.out.println();
//            }
//            if (nv instanceof NhanVienNghienCuu){
//                System.out.printf("| %-4s | %-25s | %-20s | %-10s | %-20s | %-25s | %-15s | %-12s | %-18s | %-15d |",
//                        nv.getMaNV(),nv.getTenNV(),nv.getNamSinh(),nv.getTrinhDo(),nv.getTruongDaoTao(),nv.getChuyenMon(),"Nhân viên nghiên cứu",nv.getLuongCoBan(),"null",((NhanVienNghienCuu) nv).getPhuCapDocHai());
//                System.out.println();
//            }
//            if(nv instanceof NhanVienPhucVu){
//                System.out.printf( "| %-4s | %-25s | %-20s | %-10s | %-20s | %-25s | %-15s | %-12s | %-18s | %-15d |",
//                        nv.getMaNV(),nv.getTenNV(),nv.getNamSinh(),nv.getTrinhDo(),"null","null","Nhân viên phục vụ",nv.getLuongCoBan(),"null","null");
//                System.out.println();
//            }
//        }
//    }
    public void output(){
        for (NhanVien nv : arrayList){
            if(nv instanceof NhanVienNghienCuu){
                System.out.println(nv.toString());
            }
            if(nv instanceof NhanVienPhucVu){
                System.out.println(nv.toString());
            }
            if(nv instanceof NhanVienQuanLy){
                System.out.println(nv.toString());
            }
        }
    }
    public void inBangLuongTangDan(){
        Collections.sort(this.arrayList, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if(nv1.tinhLuong() < nv2.tinhLuong()){
                    return -1;
                } else if (nv1.tinhLuong() > nv2.tinhLuong()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }

}
