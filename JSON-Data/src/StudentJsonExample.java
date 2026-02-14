import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;

class Student {
    public String name;
    public int age;
    public String[] subjects;

    public Student(String name, int age, String[] subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

public class StudentJsonExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Student s = new Student("Surajit", 22,
                new String[]{"Java", "DBMS", "Spring"});

        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(s);

        System.out.println(json);
    }
}
