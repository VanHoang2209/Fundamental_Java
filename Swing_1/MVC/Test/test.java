package Swing_1.MVC.Test;

import Swing_1.MVC.Model.Counter_Model;
import Swing_1.MVC.View.Counter_View;

public class test {
    public static void main(String[] args) {
        Counter_Model cm = new Counter_Model();
        cm.Increasement();
        cm.Increasement();
        cm.Increasement();
        System.out.println(cm.getValue());

        cm.Decreasement();
        cm.Decreasement();
        System.out.println(cm.getValue());

        cm.reset();
        System.out.println(cm.getValue());

        Counter_View cv = new Counter_View();
    }
}
