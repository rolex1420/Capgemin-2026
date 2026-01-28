package RoundRobinSystem;

class Process {
    int id;
    Process next;

    Process(int i) { id = i; }
}

public class RoundRobin {
    static Process head;

    static void add(int id) {
        Process p = new Process(id);
        if (head == null) {
            head = p;
            p.next = head;
            return;
        }
        Process t = head;
        while (t.next != head) t = t.next;
        t.next = p;
        p.next = head;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
    }
}
