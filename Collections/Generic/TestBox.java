package Collections.Generic;

public class TestBox {
    public static void main(String[] args) {
        Box box = new Box<Integer>(15);
        System.out.println("Value: " + box.getValue());

        Box box1 = new Box<Double>(20.33333);
        System.out.println("Value: " + box1.getValue());

        Box box2 = new Box<String>("Hello Văn Hoàng");
        System.out.println(box2.getValue());

    }
}
