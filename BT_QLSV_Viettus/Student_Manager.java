package BT_QLSV_Viettus;

import Collections.QuanLiSinhVien.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_Manager {
    private ArrayList<Student> List;
    public Student_Manager(ArrayList<Student> list){
        this.List = list;
    }
    public Student_Manager(){
        this.List = new ArrayList<Student>();
    }
    public void AddStudent(Student st){
        this.List.add(st);
    }
    public void showList(){
        for(Student st : List){
            System.out.println(st);
        }
    }
    public boolean isEmpty(){
        return this.List.isEmpty();
    }
    public int amountStudent(){
        return this.List.size();
    }
    public void deleteAll (){
        this.List.removeAll(List);
    }
    public boolean checkById(Student st){
        return this.List.contains(st);
    }
    public boolean deleteById(Student st){
        return this.List.remove(st);
    }
    public void searchName(String Name){
        for(Student student : List){
            if(student.getName().indexOf(Name)>=0){
                System.out.println(student);
            }
            else{
                System.out.println("Not found");
            }
        }
    }

    public void sortDescendingByPoints(){
        Collections.sort(this.List, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                if(st1.getGpa() > st2.getGpa()){
                    return -1;
                } else
                    if (st1.getGpa() < st2.getGpa()) {
                        return 1;
                }else
                    return 0;
            }
        });
    }
    public void writeFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(Student st : List){
                oos.writeObject(st);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(File file){
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            Student st = null;
            while(true){
                Object oj = ois.readObject();
                if(oj == null){
                    break;
                }
                if(oj != null){
                    st = (Student) oj;
                    this.List.add(st);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
