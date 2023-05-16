package OOP.BaiTapTrenLop.ToaDo;

public class Main {
    public static void main(String[] args) {
        Coordinate diemA = new Coordinate(4,5);
        Coordinate diemB = new Coordinate(6,7);

        System.out.print("Toạ độ điểm A: ");
        diemA.inToaDo();
        System.out.print("Toạ độ điểm B: ");
        diemB.inToaDo();

        Coordinate tong = diemA.tong2ToaDo(diemB);
        System.out.println("Tổng của 2 toạ độ: " + (tong.getX() + "," + tong.getY()));

        Coordinate doiXungDiemA = diemA.diemDoiXung();
        System.out.println("Điểm đối xứng qua trục hoành của diểm A là: " + (doiXungDiemA.getX()+","+doiXungDiemA.getY()));
        Coordinate doiXungDiemB = diemB.diemDoiXung();
        System.out.println("Điểm đối xứng qua trục hoành của diểm B là: " + (doiXungDiemB.getX()+","+doiXungDiemB.getY()));
    }
}
