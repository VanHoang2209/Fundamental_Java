package Collections.QuanLiSinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach){
        this.danhSach = danhSach;
    }
    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }

    // thêm 1 sinh viên vào danh sách
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

        // in danh sách sinh viên ra màn hình
        public void inDanhSachSV (){
        for(SinhVien sinhVien : danhSach){
            System.out.println(sinhVien);
        }
    }

    // Kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDSRong(){
        return this.danhSach.isEmpty();
    }

    // Lấy ra số lượng sinh viên trong danh sách
    public int soLuongSV(){
        return this.danhSach.size();
    }

    //Làm rỗng danh sách sinh viên
    public void lamRong(){
        this.danhSach.removeAll(danhSach);
    }

    //Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean kiemTraSVCoTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    //Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoa1SV(SinhVien sv){
        return this.danhSach.remove(sv);
    }

    //Tìm kiếm tất cả các sinh viên dựa trên Tên được nhập từ bàn phím
    public void timKiemSV(String ten){
        for (SinhVien sinhVien: danhSach){
            if(sinhVien.getHoTen().indexOf(ten) >= 0){
                System.out.println(sinhVien);
            }
        }
    }

    //Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSVGiamTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTB() > sv2.getDiemTB()){
                    return -1;
                }
                else{
                    if(sv1.getDiemTB() < sv2.getDiemTB()){
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        });
    }

    // Ghi dữ liệu xuống File
    public void GhiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(SinhVien sv : danhSach){
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Đọc dữ liệu từ File
    public void DocDuLieuTuFile(File file){
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = null;
            while(true){
                Object ov = ois.readObject();
                if(ov == null){
                    break;
                }
                if(ov != null){
                    sv = (SinhVien) ov;
                    this.danhSach.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
