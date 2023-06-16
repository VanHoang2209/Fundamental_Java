package OOP.BaiTapTrenLop.TamGiac;

public class Demo {
    public static void main(String[] args) {
        QuanLyTamGiac list = new QuanLyTamGiac();

        TamGiac tamGiac1 = new TamGiac(1,1,1);
        TamGiac tamGiac2 = new TamGiac(1,2,3);
        TamGiac tamGiac3 = new TamGiac(1,1,3);
        TamGiac tamGiac4 = new TamGiac(5,3,4);

        list.add(tamGiac1);
        list.add(tamGiac2);
        list.add(tamGiac3);
        list.add(tamGiac4);

        for (TamGiac tg : list.getList()){
            System.out.println(tg.toString());
            System.out.println("Chu vi: " + tg.chuVi());
            System.out.println("Diện tích: " + tg.dienTich());
        }

    }
}
