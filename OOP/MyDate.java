package OOP;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(int day, int month, int year){
        if(day>=1 && day<=31) {
            this.day = day;
        }else{
            this.day = 1;
        }
        if(month>=1 && month<=12) {
            this.month = month;
        }else{
            this.month = 1;
        }
        if(year>=0) {
            this.year = year;
        }else{
            this.year = 1;
        }
    }
//    public void printDay(){
//        System.out.println("Day: "+this.day);
//    }
//    public void printMonth(){
//        System.out.println("Month: "+this.month);
//    }
//    public void printYear(){
//        System.out.println("Year: "+this.year);
//    }
//    public void printDate(){
//        System.out.println("Date: "+this.day+"-"+this.month+"-"+this.year);
//    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int m){
        if(1<=m && m<=12){
            this.month = m;
        }
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        if(y >= 0){
            this.year =y;
        }
    }
    public static void main(String[] args){
        MyDate md = new MyDate(22,9,2003);
        System.out.println("Day: "+md.getDay());
        System.out.println("Month: "+md.getMonth());
        System.out.println("Year: "+md.getYear());

        md.setDay(23);
        md.setMonth(6);
        md.setYear(2002);

        System.out.println("Day: "+md.getDay());
        System.out.println("Month: "+md.getMonth());
        System.out.println("Year: "+md.getYear());
    }
}
