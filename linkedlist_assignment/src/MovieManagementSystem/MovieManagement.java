package MovieManagementSystem;

class Movie {
    String title;
    Movie next, prev;

    Movie(String t) { title = t; }
}

public class MovieManagement {
    static Movie head, tail;

    static void add(String t) {
        Movie m = new Movie(t);
        if (head == null) head = tail = m;
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    static void remove(String t) {
        Movie cur = head;
        while (cur != null && !cur.title.equals(t)) cur = cur.next;
        if (cur == null) return;
        if (cur == head) head = head.next;
        if (cur == tail) tail = tail.prev;
        if (cur.prev != null) cur.prev.next = cur.next;
        if (cur.next != null) cur.next.prev = cur.prev;
    }

    static void displayForward() {
        for (Movie t = head; t != null; t = t.next)
            System.out.println(t.title);
    }

    static void displayReverse() {
        for (Movie t = tail; t != null; t = t.prev)
            System.out.println(t.title);
    }

    public static void main(String[] args) {
        add("Inception");
        add("Avatar");
        remove("Inception");
        displayForward();
        displayReverse();
    }
}
