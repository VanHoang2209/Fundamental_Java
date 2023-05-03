package OOP.QuanLySinhVien;

public class Main {
    public static void main(String[] args) {
        NgaySinh n1 = new NgaySinh(22, 9, 2003);
        NgaySinh n2 = new NgaySinh(23, 6, 2002);
        Lop l1 = new Lop("21DTHC6", "Cong Nghe Thong Tin");
        Lop l2 = new Lop("21DTKG2", "Quan Ly Thong Tin ");
        SinhVien sv1 = new SinhVien("2180607527", "Nguyen Van Hoang", n1, 9.5, l1);
        SinhVien sv2 = new SinhVien("2180601234", "Nguyen Van A", n2, 4.5, l2);

        System.out.println("ten :Khoa "+sv1.TenKhoaSvHoc());
        System.out.println("ten Khoa: "+sv2.TenKhoaSvHoc());

        System.out.println("Kiem tra xem sv1 co dau hay kh: "+ sv1.SvCoDauHayKhong());
        System.out.println("Kiem tra xem sv2 co dau hay kh: "+ sv2.SvCoDauHayKhong());

        System.out.println(sv1.getMaSv()+"  "+sv1.getHoTen()+"  "+sv1.TenKhoaSvHoc()+"  "+n1.getDay()+"/"+n1.getMonth()+"/"+n1.getYear()+"  "+sv1.getDiemTb()+"  "+l1.getTenLop());
    }
}
