package File_67_76.File_68;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.exit;

public class ViDu {
    File file;

    public ViDu(String tenFile){
        this.file = new File(tenFile);
    }

    public boolean kiemTraThuThi(){
        // Kiểm tra thực thi
        return this.file.canExecute();
    }
    public boolean kiemTraDocFile(){
        // Kiểm tra file có thể đọc
        return this.file.canRead();
    }
    public boolean kiemTraGhiFile(){
        //Kiểm tra file có thể ghi
        return this.file.canWrite();
    }

    public void inDuongDan(){
        System.out.println(this.file.getAbsoluteFile());
    }
    public void inTen(){
        System.out.println(this.file.getName());
    }
    public void kiemTraThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Đây là thư mục");
        }
        else if(this.file.isFile()){
            System.out.println("Đây là tập tin");
        }
    }
    public void inDanhSachFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Danh sách các thư mục/tập tin con: ");
            File[] mangCon = this.file.listFiles();
            for(File file: mangCon){
                System.out.println(file.getAbsolutePath());
            }
        }
        else if(this.file.isFile()){
            System.out.println("Đây là tập tin, không có dữ liệu con bên trong");
        }
    }
    public void inCayThuMuc(){
        this.inChiTietCayThuMuc(this.file,1); // bậc 1 là cái gốc
    }
    public void inChiTietCayThuMuc(File f, int bac){
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles();
            for(File fx: mangCon) {
                inChiTietCayThuMuc(fx, bac + 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 0;
        System.out.println("Nhập tên file: ");
        String tenFile = sc.nextLine();
        ViDu vd = new ViDu(tenFile);

        do {
            System.out.println("------------MENU-------------");
            System.out.println("1. Kiểm tra file có thể thực thi hay không ?");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát");
            key = sc.nextInt();

            switch (key){
                case 1:
                    System.out.println(vd.kiemTraThuThi());
                    break;
                case 2:
                    System.out.println(vd.kiemTraDocFile());
                    break;
                case 3:
                    System.out.println(vd.kiemTraGhiFile());
                    break;
                case 4:
                    vd.inDuongDan();
                    break;
                case 5:
                    vd.inTen();
                    break;
                case 6:
                    vd.kiemTraThuMucHoacTapTin();
                    break;
                case 7:
                    vd.inDanhSachFileCon();
                    break;
                case 8:
                    vd.inCayThuMuc();
                    break;
                default:
                    exit(0);
            }
        }while (key != 0);
    }
}
