class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 101, 45000);
        employee.displayDetails();
    }
}
