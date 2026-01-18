import java.util.Scanner;

class Employee {
    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println(totalEmployees);
    }

    void display(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println(companyName);
            System.out.println(e.name);
            System.out.println(e.id);
            System.out.println(e.designation);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        sc.nextLine();
        String desig = sc.nextLine();

        Employee emp = new Employee(name, id, desig);
        emp.display(emp);
        displayTotalEmployees();
    }
}
