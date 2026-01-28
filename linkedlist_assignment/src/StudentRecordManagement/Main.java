package StudentRecordManagement;

public class Main {
    static void main(String[] args) {
        LinkList studentlist = new LinkList();
        Student s1 = new Student("surajit", 1, 18, 'b');
        Student s2 = new Student("sam", 4, 18, 'a');
        Student s3 = new Student("rum", 3, 18, 'c');
        Student s4 = new Student("jeet", 2, 18, 'a');
        studentlist.addBeginning(s4);
        studentlist.addBeginning(s1);
        studentlist.addEnd(s3);
        studentlist.searchStudent(3);

    }
}
