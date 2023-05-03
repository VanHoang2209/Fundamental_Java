package Collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class listTerator {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }
        System.out.println(l);
        ListIterator<Integer> lIterator = l.listIterator();
        while(lIterator.hasNext()){
            int i = (Integer) lIterator.next();
            if(i % 2 == 0){
                i++;
                lIterator.set(i);
                lIterator.add(i);
            }
        }
        System.out.print(" " + l);
    }
}
