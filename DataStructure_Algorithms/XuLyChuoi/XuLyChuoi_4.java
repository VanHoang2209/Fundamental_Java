package DataStructure_Algorithms.XuLyChuoi;

public class XuLyChuoi_4 {
    public static void main(String[] args) {
        String s1 = "Nguyễn Văn";
        String s2 = " Hoàng";

        //Hàm concat => nối chuỗi
        System.out.println(s1.concat(s2));

        //Hàm replace => thay thế
        String s3 = "Sao đẹp trai vãi l";
        String s4 = s3.replaceAll("Sao","Hoàng");
        System.out.println("s4 = " + s4);

        //toLowerCase => chuyển về thường
        //toUpperCase => chuyển về hoa
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        // trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
        String s5 = "    I'm Hoàng ";
        System.out.println(s5.trim());

        // subString => cắt chuỗi
        String s6 = "Cristiano Ronaldo";
        System.out.println(s6.substring(7));
        System.out.println(s6.substring(10,17));
    }
}
