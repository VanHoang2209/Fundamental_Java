package DataStructure_Algorithms.Enum;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday,"Chào cờ , Toán , Ngữ Văn");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday,"Ngữ Văn, Hóa Học");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday,"Lịch sử, Vật lý");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday,"Tự chọn, Thể dục");
        ThoiKhoaBieu tkb_t6 = new ThoiKhoaBieu(Day.Friday,"GDCD, Sinh học, Tin học");
        System.out.println(tkb_t2);
        System.out.println(tkb_t3);
        System.out.println(tkb_t4);
        System.out.println(tkb_t5);
        System.out.println(tkb_t6);

        int x = Thang.Tháng_ba.soNgay();
        System.out.println("Tháng ba có: "+ x +" ngày");
    }
}
