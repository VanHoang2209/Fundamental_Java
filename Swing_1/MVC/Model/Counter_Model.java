package Swing_1.MVC.Model;

public class Counter_Model {
    private int value;
    public Counter_Model(){
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void Increasement (){
        this.value++;
    }
    public void Decreasement(){
        this.value--;
    }
    public void reset(){
        this.value = 0;
    }

}
