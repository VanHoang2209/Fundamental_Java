package OOP;

public class SoHoc {
    private int number1;
    private int number2;

    public SoHoc(int so1, int so2){
        this.number1 = so1;
        this.number2 = so2;
    }
    public int getNumber1(){
        return this.number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2(){
        return this.number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    

    public static void main(String[] args){
        SoHoc sh = new SoHoc(1,2);
        System.out.println("Number1: "+sh.getNumber1());
        System.out.println("Number2: "+sh.getNumber2());
    }
}
