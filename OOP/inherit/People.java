package OOP.inherit;

public class People {
    protected String name;
    protected int namSinh;
    public People(String name, int namSinh){
        this.name = name;
        this.namSinh = namSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public void eat(){
        System.out.println("I'm eating");
    }
    public void sleep(){
        System.out.println("I'm sleeping");
    }
}
class VietNamPeople extends People{
    public VietNamPeople(String name, int namSinh){
        super(name,namSinh);
    }
    public void XinChao(){
        System.out.println("Xin chao Viet Nam");
    }
}
class AmericanPeople extends People{
    public AmericanPeople(String name, int namSinh){
        super(name,namSinh);
    }
    public void XinChao(){
        System.out.println("Hello American");
    }
}
class FrenchPeopLe extends People{
    public FrenchPeopLe(String name, int namSinh){
        super(name,namSinh);
    }
    public void XinChao(){
        System.out.println("Salut French");
    }
}

class run{
    public static void main(String[] args) {
        VietNamPeople vn = new VietNamPeople("Nguyen Van Hoang",2003);
        AmericanPeople usa = new AmericanPeople("Nguyen Van",2002);
        FrenchPeopLe fr = new FrenchPeopLe("Nguyen ",2001);

        vn.eat();
        vn.sleep();
        vn.XinChao();


        usa.eat();
        usa.sleep();
        usa.XinChao();

        fr.eat();
        fr.sleep();
        fr.XinChao();
    }
}