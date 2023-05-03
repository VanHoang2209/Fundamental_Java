package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        Iterator<Integer> arrIterator = arr.iterator();
        while(arrIterator.hasNext()){
            int i = arrIterator.next();
            System.out.print(i + " ");
            if(i % 2 != 0){
                arrIterator.remove();
            }
        }
        System.out.println("\n" +arr);
    }
}
