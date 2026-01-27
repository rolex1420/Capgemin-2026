package StudentRecordManagement;

public class Student {
    int roll;
    int age;
    String name;
    protected char grade;
    Student next;
    Student() {
        roll = 0;
        age = 0;
        name = "";
        next=null;
    }
    Student(String name,int roll,int age,char grade) {
        this.roll = roll;
        this.age = age;
        this.name = name;
        this.grade=grade;
        next=null;
    }
}
