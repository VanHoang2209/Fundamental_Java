package File_67_76.File_71;

import java.io.PrintWriter;

public class GhiDuLieuDangTextVaoFile {
    public static void main(String[] args) {
        // sử dụng với cửa sổ Run
//        PrintWriter pw = new PrintWriter(System.out);
//        pw.println("Hello mình là Văn Hoàng");
//        pw.flush();

        // Ghi text ra 1 cái file
        try{
            PrintWriter pw = new PrintWriter("E:\\Intellij\\IntelliJ IDEA Community Edition 2022.3.1\\Java\\JavaBasic\\src\\File_67_76\\File_71\\file.txt","UTF-8");
            pw.println("Hello mình là Văn Hoàng");
            pw.print("Dữ liệu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print("là số PI");
            pw.println();

            Student st = new Student(7527,"Nguyễn Văn Hoàng");

            pw.println(st);
            pw.println();
            pw.flush();
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
