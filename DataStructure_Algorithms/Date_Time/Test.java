package DataStructure_Algorithms.Date_Time;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        // Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for(int i=0; i<100; i++){           // i = 1.000.000 thì mất 1s :))
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trước kh chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);
        System.out.println("Thời gian chạy: " + ((t2-t1)/1000) + "s");

        // TimeUnit
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000*365) + "s"); // truyền vào số ngày
        System.out.println("25 giờ = " + TimeUnit.HOURS.toSeconds(25) + "s");

        // Date
        Date d = new java.sql.Date(System.currentTimeMillis());
        System.out.println(d.getDate() + "/" + (d.getMonth()+1) + "/" +(d.getYear()+1900));

        // Calendar
        // Cộng thêm, trừ bớt giờ ngày tháng năm
        Calendar  c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONDAY)+1) + "-" + c.get(Calendar.YEAR));

        c.add(Calendar.HOUR,24); // Cộng thêm 24 tiếng => sang ngày mới
        System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONDAY)+1) + "-" + c.get(Calendar.YEAR));

        c.add(Calendar.DATE,-14); // Trừ bớt 14 ngày
        System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONDAY)+1) + "-" + c.get(Calendar.YEAR));

        // DateFormat
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy, HH:mm:ss a");
        System.out.println(df.format(d));

        Date date = new Date();
        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = df1.format(date);
        System.out.println(dateString);
    }
}
