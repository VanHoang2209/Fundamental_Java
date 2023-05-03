package OOP.inherit;

public class animal {
    protected String name;
    public animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("Toi dang an banh xeo");
    }
    public void makeSound(){
        System.out.println("Gau gau");
    }
     
}
