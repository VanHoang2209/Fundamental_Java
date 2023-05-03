package Collections.Map;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.TreeMap;

//Tra từ điển Anh - Việt
//    1. Thêm từ (Từ khóa, ý nghĩa)
//    2. Xóa từ
//    3. Tìm ý nghĩa của từ khóa => tra từ
//    4. In ra danh sách từ khóa
//    5. In ra số lượng từ
//    6. Xóa tất cả các từ khóa
public class TuDien {
    private Map<String, String> duLieu = new TreeMap<String, String>(); //=> Sắp xếp theo thứ tự nhất định
//private Map<String, String> duLieu = new HashMap<String, String>();     => Không sắp xếp theo thứ tự

    public String themTu (String tuKhoa, String yNghia){
        return this.duLieu.put(tuKhoa,yNghia);
    }

    public String xoaTu (String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }
    public String traTu (String tuKhoa){
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }
    public void inDanhSachTuKhoa(){
        Set<String> danhSachTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(danhSachTuKhoa.toArray()));
    }
    public int inSoLuong (){
        return this.duLieu.size();
    }
    public void xoaTatCa(){
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuDien td = new TuDien();
        int menu = 0;
        do {
            System.out.println("------------MENU-------------");
            System.out.println("1. Thêm từ");
            System.out.println("2. Xóa từ");
            System.out.println("3. Tra từ");
            System.out.println("4. In danh sách từ");
            System.out.println("5. In số lượng từ");
            System.out.println("6. Xóa tất cả từ");
            System.out.println("0. Thoát khỏi chương trình");
            menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1){
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhập vào ý nghĩa của từ khóa: ");
                String yNghia = sc.nextLine();
                td.themTu(tuKhoa,yNghia);
            } else if (menu == 2 || menu == 3) {
                System.out.println("Nhập vào từ khóa");
                String tuKhoa = sc.nextLine();
                if(menu == 2){
                    td.xoaTu(tuKhoa);
                }else{
                    System.out.println("Ý nghĩa là: " + td.traTu(tuKhoa));
                }
            } else if (menu == 4) {
                System.out.println("Danh sách từ khóa: ");
                td.inDanhSachTuKhoa();
            } else if (menu == 5) {
                System.out.println("Số lượng từ khóa: "+ td.inSoLuong());
            } else if (menu == 6) {
                td.xoaTatCa();
            }
        }while (menu != 0);
    }
}
