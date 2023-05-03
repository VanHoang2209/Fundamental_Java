package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> listLanguage = new ArrayList<String>();
        listLanguage.add("Java");
        listLanguage.add("PHP");
        listLanguage.add("C++");
        listLanguage.add("Python");
        System.out.println("List language: " + listLanguage);

//        listLanguage.removeAll(listLanguage);
//        System.out.println("List language: " + listLanguage);

        // vòng lặp for
        for(String str: listLanguage){
            System.out.println(str);
        }
        listLanguage.set(3,"JavaScript");
        System.out.println(listLanguage);

        System.out.println(listLanguage.get(2));

        //Xóa tất cả các phần tử có trong ArrayList
//        System.out.println("CLEAR\n\n");
//        System.out.println("Số phần tử của list ban đầu: " + listLanguage.size());
//        listLanguage.clear();
//        System.out.println("Phần tử của list sau khi xóa: ");
//        System.out.println("Số phần tử của list sau khi xóa: "+ listLanguage.size());

        //Xóa phần tử ra khỏi ArrayList
        System.out.println("REMOVE");
        listLanguage.remove(2);
        System.out.println(listLanguage);
        listLanguage.remove("Java");
        System.out.println(listLanguage);

        // Tìm kiếm trực tiếp phần tử
        System.out.println("CONTAINS");
        System.out.println(listLanguage.contains("PHP"));
        System.out.println(listLanguage.contains("Java"));

        //Tìm kiếm vị trí xuất hiện đầu tiên của phần tử

        System.out.println("INDEXOF");
        System.out.println(listLanguage.indexOf("Java"));
        System.out.println(listLanguage.indexOf("JavaScript"));

        //Tìm kiếm vị trí xuất hiện của 1 phần tử cuối cùng trong list
        System.out.println("LASTINDEXOF");
        listLanguage.add("JavaScript");
        listLanguage.add("PHP");
        System.out.println(listLanguage);
        System.out.println(listLanguage.lastIndexOf("PHP"));
        System.out.println(listLanguage.lastIndexOf("JavaScript"));

        //Chuyển ArrayList sang mảng Array
        Object[] arr = listLanguage.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " là: "+ arr[i]);
        }

        // Xuất mảng sử dụng iterator
        System.out.println("ITERATOR");
        Iterator<String> iteratorListLanguage = listLanguage.iterator();
        while (iteratorListLanguage.hasNext()){
            System.out.print(iteratorListLanguage.next() + " ");
        }

        // Xuất mảng sử dụng for each
        System.out.println("\nFOR-EACH");
        for(String l: listLanguage){
            System.out.print(l + " ");
        }

        //Xuất mảng thông qua vị trí
        System.out.println("\nINDEX");
        for (int i = 0; i < listLanguage.size(); i++) {
            System.out.print(listLanguage.get(i)+ " ");
        }




        // sử dụng vòng lặp iterator
//        Iterator<String> iterator = listLanguage.iterator();
//        System.out.println("List language: ");
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
