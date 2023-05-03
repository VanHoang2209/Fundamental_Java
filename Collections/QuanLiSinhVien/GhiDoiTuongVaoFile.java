package Collections.QuanLiSinhVien;

import java.io.*;

public class GhiDoiTuongVaoFile {
    public static void main(String[] args) {
        try {
        File file = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\Collections\\QuanLiSinhVien\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("2003","nguyễn văn hoàng",2003, 10);
            oos.writeObject(sv);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
