import java.io.*;
import java.util.*;

class Student {
    int id, age, marks;
    String name;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}

public class CSVToStudentObjects {
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            list.add(new Student(
                    Integer.parseInt(s[0]),
                    s[1],
                    Integer.parseInt(s[2]),
                    Integer.parseInt(s[3])
            ));
        }
        br.close();

        list.forEach(System.out::println);
    }
}
