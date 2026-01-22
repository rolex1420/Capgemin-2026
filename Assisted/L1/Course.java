import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("ABC School");
        Student s1 = new Student("Anu");
        Course c1 = new Course("Math");

        school.addStudent(s1);
        s1.enroll(c1);
    }
}
