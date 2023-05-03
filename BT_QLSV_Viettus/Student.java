package BT_QLSV_Viettus;

import Collections.QuanLiSinhVien.SinhVien;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>,Serializable{
    private String id;
    private String name;
    private int age;
    private float gpa;
    public Student(String id, String name, int age, float gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public Student(String id){
        this.id = id;
    }

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,age,gpa);
    }

    public String getFileLine(){
        return id +", " + name + ", " + age + ", "+gpa;
    }
}
