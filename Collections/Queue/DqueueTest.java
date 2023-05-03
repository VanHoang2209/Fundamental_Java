package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DqueueTest {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();
        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyễn Văn A");
        danhSachSV.offer("Nguyễn Văn B");
        danhSachSV.offer("TITV 2");
        danhSachSV.offerLast("TITV 4");
        danhSachSV.offerFirst("TITV 0");

        // poll: lấy ra và xóa giá trị
        // peek: lấy ra và không xóa giá trị
//        while(true){
//            String ten = danhSachSV.poll();
//            if(ten == null){
//                break;
//            }
//            System.out.println(ten);
//        }
        System.out.println(danhSachSV);
        danhSachSV.remove("TITV 1");
        System.out.println(danhSachSV);
    }
}

