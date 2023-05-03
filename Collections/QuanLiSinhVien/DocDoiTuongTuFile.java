package Collections.QuanLiSinhVien;

import java.io.*;

public class DocDoiTuongTuFile {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\Collections\\QuanLiSinhVien\\file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = (SinhVien) ois.readObject();
            System.out.println(sv.getDiemTB());
            System.out.println(sv);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
