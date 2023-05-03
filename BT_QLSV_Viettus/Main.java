package BT_QLSV_Viettus;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Manager sm = new Student_Manager();
        int key = 0;

        while(true){
            System.out.println("------MENU MANAGER STUDENT USE CONSOLE IN JAVA-------");
            System.out.println("1. Add student\n" +
                    "2. Show list student\n" +
                    "3. Check empty\n" +
                    "4. Number of students\n" +
                    "5. Empty the student list \n" +
                    "6. Check student exist on the list\n" +
                    "7. Delete student by ID\n" +
                    "8. Search all student by Name\n" +
                    "9. Output a list of students with high to low scores\n" +
                    "10. Save to file Student.txt\n" +
                    "11. Read content from a file\n" +
                    "0.Exit program");
            System.out.println("Please choose: ");
            key = sc.nextInt();
            sc.nextLine();
            switch (key){
                case 1:
                    System.out.println("Input student Id: ");
                    String id = sc.nextLine();
                    System.out.println("Input student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Input student Age: ");
                    int age = sc.nextInt();
                    System.out.println("Input student Gpa: ");
                    float gpa = sc.nextFloat();
                    Student st = new Student(id,name,age,gpa);
                    sm.AddStudent(st);
                    break;
                case 2:
                    sm.showList();
                    break;
                case 3:
                    System.out.println("List Empty : " + sm.isEmpty());
                    break;
                case 4:
                    System.out.println("Number of Students: " + sm.amountStudent());
                    break;
                case 5:
                    sm.deleteAll();
                    break;
                case 6:
                    System.out.println("Input Id to check: ");
                    id = sc.nextLine();
                    st = new Student(id);
                    System.out.println("Check ID in the list: "+sm.checkById(st));
                    break;
                case 7:
                    System.out.println("Input Id to delete: ");
                    id = sc.nextLine();
                    st = new Student(id);
                    sm.deleteById(st);
                    break;
                case 8:
                    System.out.println("Input Name to search: ");
                    name = sc.nextLine();
                    System.out.println("Consult: ");
                    sm.searchName(name);
                    break;
                case 9:
                    sm.sortDescendingByPoints();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Input file name: ");
                    String fileName = sc.nextLine();
                    File file = new File(fileName);
                    sm.writeFile(file);
                    break;
                case 11:
                    System.out.println("Input file name: ");
                    String fName = sc.nextLine();
                    File f = new File(fName);
                    sm.readFile(f);
                    break;
                case 0:
                    exit(0);
            }
        }
    }
}
