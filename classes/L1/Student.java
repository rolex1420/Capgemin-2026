import java.util.Scanner;

class Student {
    static String universityName = "Chandigarh University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println(totalStudents);
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println(universityName);
            System.out.println(s.name);
            System.out.println(s.rollNumber);
            System.out.println(s.grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int roll = sc.nextInt();
        char grade = sc.next().charAt(0);

        Student st = new Student(name, roll, grade);
        st.display(st);
        displayTotalStudents();
    }
}
