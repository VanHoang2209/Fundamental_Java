package Collections.ArrayList;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student@[name=" + name + ", age=" + age +"]";
    }
}
public class ExArray_Student {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<Student>();
        Student st1 = new Student("Bac", 17);
        Student st2 = new Student("Nam", 20);
        Student st3 = new Student("Trung", 19);

        st.add(st1);
        st.add(st2);
        st.add(st3);

        for (Student student: st){
            System.out.println(student.toString());
        }
    }
}
