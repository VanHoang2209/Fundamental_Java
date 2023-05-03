package OOP.inherit;

public class dog extends animal {
    public dog(){
        super("Dog");
    }
    @Override
    public void eat(){
        System.out.println("An");
    }
    @Override
    public void makeSound(){
        System.out.println("Gau gau gau");
    }

//    public void bark (){
//        System.out.println("Gau Gau");
//    }
}
