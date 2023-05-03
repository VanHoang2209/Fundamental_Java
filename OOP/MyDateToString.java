package OOP;

import java.util.Objects;

public class MyDateToString {
    private int day;
    private int month;
    private int year;
    public MyDateToString(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int d){
        if(this.day >= 1 && this.day <= 31){
            this.day = d;
        }
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int m){
        if(this.month >= 1 && this.month <= 12){
            this.month = m;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int y){
        if(this.year >= 0){
            this.year = y;
        }
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        MyDateToString other = (MyDateToString) object;
        if(this.day != other.day){
            return false;
        }
        if(this.month != other.month){
            return false;
        }
        if(this.year != other.year){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public static void main(String[] args){
        MyDateToString mds1 = new MyDateToString(22,9,2003);
        MyDateToString mds2 = new MyDateToString(01,5,2003);
        MyDateToString mds3 = new MyDateToString(22,9,2003);

        System.out.println(mds1);
        System.out.println(mds2);
        System.out.println(mds3);

        System.out.println("So sanh mds1 va mds2: " + mds1.equals(mds2));
        System.out.println("So sanh mds1 va mds3: " + mds1.equals(mds3));
        System.out.println("So sanh mds2 va mds3: " + mds2.equals(mds3));
    }
}
