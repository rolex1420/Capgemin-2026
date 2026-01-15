class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "D";
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Amit", 12, 88);
        student.displayDetails();
    }
}
