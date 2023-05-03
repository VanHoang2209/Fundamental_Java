package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueTest {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyễn Văn A");
        danhSachSV.offer("Nguyễn Văn B");
        danhSachSV.offer("TITV 2");


        // poll: lấy ra và xóa giá trị
        // peek: lấy ra và không xóa giá trị
        while(true){
            String ten = danhSachSV.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
