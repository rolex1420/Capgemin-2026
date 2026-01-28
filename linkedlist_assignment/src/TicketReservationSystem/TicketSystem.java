package TicketReservationSystem;

class Ticket {
    int id;
    Ticket next;

    Ticket(int i) { id = i; }
}

public class TicketSystem {
    static Ticket head;

    static void add(int id) {
        Ticket t = new Ticket(id);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        Ticket c = head;
        while (c.next != head) c = c.next;
        c.next = t;
        t.next = head;
    }

    static int count() {
        if (head == null) return 0;
        int c = 0;
        Ticket t = head;
        do {
            c++;
            t = t.next;
        } while (t != head);
        return c;
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        System.out.println(count());
    }
}
