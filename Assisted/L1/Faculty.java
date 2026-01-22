import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class Main {
    public static void main(String[] args) {
        University u = new University("State University");
        Department d = new Department("CSE");
        Faculty f = new Faculty("Dr. Rao");

        u.addDepartment(d);
        u.addFaculty(f);
    }
}
