package DataStructure_Algorithms.XuLyChuoi;

public class XuLyChuoi_2 {
    public static void main(String[] args) {
        String s1 = "hoang";
        String s2 = "HOANG";
        String s3 = "hoang";

        //Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt viết HOA viết thường
        System.out.println("Equals s1 voi s2: " + s1.equals(s2));
        System.out.println("Equals s1 voi s3: " + s1.equals(s3));
        System.out.println("Equals s2 voi s3: " + s2.equals(s3));

        //Hàm equalsIgnoreCase => so sánh nội dung của chuỗi, không phân biệt HOA thường
        System.out.println("equalsIgnoreCase s1 voi s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("equalsIgnoreCase s1 voi s3: " + s1.equalsIgnoreCase(s3));
        System.out.println("equalsIgnoreCase s2 voi s3: " + s2.equalsIgnoreCase(s3));

        //Nếu so sánh tài khoản và mật khẩu của người dùng khi đăng nhập thì nên dùng equals

        // Hàm compareTo => so sánh > < =
        // Nếu so sánh sv1 và sv2 ra giá trị âm thì sv1 < sv2
        //             sv1 và sv3 ra giá trị dương thì sv1 > sv3
        //              sv1 và sv4 ra giá trị = 0 thì sv1 = sv4
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn Hoàng";
        String sv3 = "Nguyễn Văn";
        String sv4 = "Nguyễn Văn a";

        System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+sv1.compareTo(sv4));

        //Hàm compareToIgnoreCase => Tương tự hàm compareTo, không phân biệt chữ hoa chữ thường
        String sv5 = "Nguyễn Văn A";
        String sv6 = "Nguyễn Văn a";

        System.out.println("sv5 compareToIgnoreCase sv6: "+ sv5.compareToIgnoreCase(sv6));

        // Hàm regionMatches => so sánh 1 đoạn
        String r1 = "VanHoang.vn";
        String r2 = "Hoang.v";
        boolean check  = r1.regionMatches(3,r2,0,8);
        //boolean check  = r1.regionMatches(true,3,r2,0,8); giá trị true trong hàm này nghĩa là không so sánh HOA hay thường
        System.out.println(check);

        //Hàm startsWith => Hàm kiểm tra chuỗi bắt đầu bằng.....
        // 0383 123 1234
        // 0383 321 4321
        String sdt = "0383 123 1234";
        System.out.println(sdt.startsWith("0383"));
        System.out.println(sdt.startsWith("0373"));

        //Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng....
        String tenFile1 = "I love Việt Nam.jpg";
        String tenFile2 = "Cr7.png";

        if(tenFile1.endsWith(".jpg")) {
            System.out.println("Là hình ảnh Tôi yêu Việt Nam");
        }
        else if(tenFile1.endsWith(".png")){
            System.out.println("Là hình ảnh Cristiano Ronaldo");
        }

        if(tenFile2.endsWith(".jpg")) {
            System.out.println("Là hình ảnh Tôi yêu Việt Nam");
        }
        else if(tenFile2.endsWith(".png")){
            System.out.println("Là hình ảnh Cristiano Ronaldo");
        }
    }
}
