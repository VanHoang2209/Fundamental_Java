package OOP.ThongTinSach;

public class Run {
    public static void main(String[] args){
        Date d1 = new Date(22,9,2003);
        Date d2 = new Date(14,9,2003);
        Date d3 = new Date(28,3,2003);

        TacGia tg1 = new TacGia("Nguyen Van Hoang", d1);
        TacGia tg2 = new TacGia("Nguyen Thi Minh Tinh", d2);
        TacGia tg3 = new TacGia("Dang An Nguyen", d3);

        Sach s1 = new Sach("2 ngay 1 dem",150000,2010,tg1);
        Sach s2 = new Sach("1 ngay 2 dem",200000,2009,tg2);
        Sach s3 = new Sach("2 ngay 2 dem",9000000,2010,tg3);

        s1.in1QS();
        s2.in1QS();
        s3.in1QS();

        System.out.println("Kiem tra nam xuat ban cua sach: "+s1.kiemTraNamXB(s3));
        System.out.println("Kiem tra nam xuat ban cua sach: "+s1.kiemTraNamXB(s2));
        System.out.println("Kiem tra nam xuat ban cua sach: "+s2.kiemTraNamXB(s3));

        System.out.println("So tien sau khi duoc giam gia cua sach "+s1.getTenSach() +" la " +s1.sachSauGiamGia(20));
        System.out.println("So tien sau khi duoc giam gia cua sach "+s2.getTenSach() +" la " +s2.sachSauGiamGia(20));
        System.out.println("So tien sau khi duoc giam gia cua sach "+s3.getTenSach() +" la " +s3.sachSauGiamGia(20));
    }
}
