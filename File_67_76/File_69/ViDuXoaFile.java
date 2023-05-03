package File_67_76.File_69;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {

    public static void xoaFile(File fx){
        if(fx.isFile()){  // xóa nếu là tập tin
            System.out.println("Đã xóa: " + fx.getAbsoluteFile());
            fx.delete();
        } else if (fx.isDirectory()) {
            File[] mangCon = fx.listFiles();  // lấy các file con
            for(File f : mangCon){
                xoaFile(f); // xóa các file con
            }
            System.out.println("Đã xóa: " + fx.getAbsoluteFile());
            fx.delete(); // xóa bản thân thư mục sau khi đã xóa các file con
        }
    }

//    public static void xoaFile2(File fx){
//        if(fx.isFile()){
//            fx.delete();
//        } else if (fx.) {
//
//        }
//    }

    public static void main(String[] args) {
        // sử dụng class File xóa tập tin hoặc thư mục
        File f1 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_69\\F1");
        File f2 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_69\\F2");
        File viDu = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_69\\abc.docx");

//        f1.deleteOnExit(); // không xóa được F1 tại vì F1 không phải là thư mục rỗng
//        f2.deleteOnExit(); // xóa được vì F2 là thư mục rỗng
//        viDu.deleteOnExit(); // xóa được vì là tập tin

        System.out.println(f2.delete());

//        ViDuXoaFile.xoaFile(f1);

        // sử dụng class Files xóa tập tin hoặc thư mục
        Path p1 = f1.toPath();
        Path p2 = f2.toPath();
        Path pViDu = viDu.toPath();
        try {
//            Files.deleteIfExists(p1);
            Files.deleteIfExists(p2);
            Files.deleteIfExists(pViDu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
