package TaskSchedulerSystem;

class Task {
    int id;
    Task next;

    Task(int i) { id = i; }
}

public class TaskScheduler {
    static Task head;

    static void add(int id) {
        Task t = new Task(id);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        Task c = head;
        while (c.next != head) c = c.next;
        c.next = t;
        t.next = head;
    }

    static void display() {
        if (head == null) return;
        Task c = head;
        do {
            System.out.println(c.id);
            c = c.next;
        } while (c != head);
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        display();
    }
}
