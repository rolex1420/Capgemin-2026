import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department d1 = new Department("IT");
        d1.addEmployee("Ravi");
        company.addDepartment(d1);
    }
}
