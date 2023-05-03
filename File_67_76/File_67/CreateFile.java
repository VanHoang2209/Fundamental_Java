package File_67_76.File_67;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // Lưu ý:
        // MS Windows: \ => \\ | Ví dụ: "C:\\Folder 1\\Folder 2\\Folder 3\\File.xxx";
        // Linux, Mac OS: / | Ví dụ: "/Folder 1/Folder 2/Folder 3/File.xxx;

        //Kiểm tra thư mục hoặc tập tin có tồn tại hay không
        File folder1 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File");
        File folder2 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\TaoFile");
        File folder3 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File\\hoang.docx");

        System.out.println("Kiểm tra folder 1 có tồn tại hay không: "+folder1.exists());
        System.out.println("Kiểm tra folder 1 có tồn tại hay không: "+folder2.exists());
        System.out.println("Kiểm tra folder 1 có tồn tại hay không: "+folder3.exists());

        //Tạo thư mục
        // + mkdir(): tạo 1 thư mục
        File folder4 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File\\Directory_1");
        folder4.mkdir();

        // + mkdirs(): tạo nhiều thư mục cùng lớp
        File folder5 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File\\Directory_1\\Directory_2\\Directory_3");
        // folder5.mkdir() : chương trình chạy sẽ không tạo được Directory 2, Directory 3
        folder5.mkdirs();

        // Tạo tập tin ( có phần mở rộng: .exe, .txt, .docx, ....)
        File file1 = new File("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File\\Directory_1\\Vidu1.txt");

        try {

            file1.createNewFile();
        } catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
            throw new RuntimeException(e);
        }
    }
}
