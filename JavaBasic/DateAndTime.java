package JavaBasic;

import java.util.Calendar;
import java.util.Formatter;

public class DateAndTime{
    public static void main(String args[]){
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
    }
}