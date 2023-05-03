package File_67_76.File_70;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DoiTen_DiChuyen_CopyFile {
    public static void CopyFileAll (File f4, File f4_copy){
        try {
            Files.copy(f4.toPath(),f4_copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] mangCon = f4.listFiles();
        if(f4.isDirectory()){
            for(File file : mangCon){
                // duyệt từng phần tử của mảng rồi copy đường dẫn tuyệt đối và tên file
                File file_new = new File(f4_copy.getAbsoluteFile() + "/"+file.getName());
                // sử dụng đệ quy
                CopyFileAll(file,file_new);
            }
        }
    }

    public static void main(String[] args) {
        File f1 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\hoang.txt");
        File f2 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\nguyenvanhoang.txt");
        File f3 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\nguyenvanhoang_2209.txt");
        // 1. Thay đổi tên tập tinh hoặc thư mục
        // sử dụng file
//        f1.renameTo(f2); // đổi tên file f1 thành tên file f2

        // sử dụng files để đổi tên
//        try {
//            Files.move(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 2. Di chuyển file
//        File f_3new = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f3\\nguyenvanhoang_2209.txt");
//        try {
//            Files.move(f3.toPath(),f_3new.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File folder_1 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f2");
//        File folder_2 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f1\\f2");
//
//        try {
//            Files.move(folder_1.toPath(),folder_2.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        // 3. Copy file

        File f0 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f0");
        File f0_copy = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f0_copy");

        // cách này chỉ copy phần thư mục bên ngoài chứ không copy các phần bên trong thư mục
        try {
            Files.copy(f0.toPath(),f0_copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // cách này copy các phần bên ngoài và cả bên trong của thư mục
        File f4 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f4");
        File f4_copy = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_70\\f4_copy");
        CopyFileAll(f4,f4_copy);
    }
}
