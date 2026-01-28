package StudentRecordManagement;

public class LinkList {
    Student head;
    Student tail;
    LinkList(){
        head=null;
        tail=null;
    }
    void addBeginning(String name,int roll,int age,char grade){
        Student n=new Student(name,roll,age,grade);
        if(head==null){
            head=n;
            tail=n;
        }else{
            n.next=head;
            head=n;
        }
    }
    void addBeginning(Student n){
        if(head==null){
            head=n;
            tail=n;
        }else{
            n.next=head;
            head=n;
        }
    }
    void addEnd(Student n){
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=n;
        }
    }
    void delete(int roll){
        Student slow=null;
        Student fast=head;
        while(fast!=null){
            if(fast.roll==roll){
                if(slow==null){
                    head=head.next;
                }else{
                    slow.next=fast.next;
                }
            }
            slow=fast;
            fast=fast.next;
        }
    }
    void searchStudent(int roll){
        Student s=head;
        while(s!=null){
            if(s.roll==roll){
                System.out.println("Name of Student:-"+s.name);
                System.out.println("Roll Number:-"+s.roll);
                System.out.println("Age:-"+s.age);
            }
            s=s.next;
        }
    }
    void displayAllStudent(){
        Student s=head;
        while(s!=null){
                System.out.println("Name of Student:-"+s.name);
                System.out.println("Roll Number:-"+s.roll);
                System.out.println("Age:-"+s.age);
                System.out.println("Grade:-"+s.grade+"\n");
                s=s.next;
            }
        }

    void updateStudentGrade(int roll,char newg) {
        Student s = head;
        while (s != null) {
            if(s.roll==roll){
                s.grade=newg;
            }
            s=s.next;
        }
    }

}
