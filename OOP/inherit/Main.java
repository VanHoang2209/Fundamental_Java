package OOP.inherit;

public class Main {
    public static void main(String[] args) {
        dog d1 = new dog();
        babydog bbd = new babydog();
        bbd.eat();
//        bbd.bark();
        bbd.weep();

        d1.eat();
        d1.makeSound();

        cat c = new cat();
        c.eat();
        c.meow();

        bird b = new bird();
        b.eat();
        b.fly();
    }
}
