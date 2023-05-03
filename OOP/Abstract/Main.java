package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(4,9);
        ToaDo td2 = new ToaDo(6,2);
        ToaDo td3 = new ToaDo(1,10);

//        Hinh h1 = new Hinh(); ==> Lỗi, không thể khai báo vẽ hình theo cách này
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2,5.5);
        Hinh h3 = new HinhChuNhat(td3,4,6);

        System.out.println("Dien tich 1 diem: "+h1.TinhDienTich());
        System.out.println("Dien tich hinh tron: "+h2.TinhDienTich());
        System.out.println("Dien tich hinh chu nhat: "+h3.TinhDienTich());
    }
}
