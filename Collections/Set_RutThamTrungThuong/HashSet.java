package Collections.Set_RutThamTrungThuong;

import java.util.*;

public class HashSet {
    Set thungPhieuDuThuong = new java.util.HashSet<>(); // HashSet: Không sắp xếp theo thứ tự nhất định

        public void setThungPhieuDuThuong(Set thungPhieuDuThuong) {
            this.thungPhieuDuThuong = thungPhieuDuThuong;
        }

        public boolean themMaSoDuThuong (String giaTri){
            return this.thungPhieuDuThuong.add(giaTri);
        }

        public boolean xoaMaSoDuThuong (String giaTri){
            return this.thungPhieuDuThuong.remove(giaTri);
        }

        public boolean kiemTraMaSoTonTai (String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaAllPhieuDuThuong (){
        this.thungPhieuDuThuong.clear();
    }

    public int soLuongPhieuDuThuong (){
        return this.thungPhieuDuThuong.size();
    }

    public String rutThamTrungThuong (){
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        int key = 0;
        Scanner sc = new Scanner(System.in);
        HashSet rt = new HashSet();
        do {
            System.out.println("--------------MENU------------");
            System.out.println("1. Thêm mã số dự thưởng");
            System.out.println("2. Xóa mã số dự thưởng");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng");
            System.out.println("5. Số lượng phiếu dự thưởng");
            System.out.println("6. Rút thăm trúng thưởng");
            System.out.println("7. In ra tất cả các phiếu");
            System.out.println("0. Thoát khỏi chương trình");

            System.out.print("Nhập lựa chọn: ");
            key = sc.nextInt();
            sc.nextLine();
                if (key == 1 || key == 2 || key == 3) {
                    System.out.println("Nhập vào mã phiếu dự thưởng: ");
                    String giaTri = sc.nextLine();
                    if(key == 1){
                        rt.themMaSoDuThuong(giaTri);
                    }
                    else if(key == 2){
                        rt.xoaMaSoDuThuong(giaTri);
                    }
                    else{
                        System.out.println("Kiểm tra mã số dự thưởng có tồn tại: " + rt.kiemTraMaSoTonTai(giaTri));
                    }
                }
                else if (key == 4) {
                    rt.xoaAllPhieuDuThuong();
                } else if (key == 5) {
                    System.out.println("Số lượng phiếu dự thưởng: " + rt.soLuongPhieuDuThuong());
                } else if (key == 6){
                    System.out.println("Mã số trúng thưởng là: " + rt.rutThamTrungThuong());
                } else if (key == 7) {
                    System.out.println("Tất cả các phiếu dự thưởng: ");
                    rt.inTatCa();
                }
        }
            while (key != 0) ;
    }
}
