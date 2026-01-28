package SocialMediaFriendsSystem;

class Friend {
    int id;
    Friend next;

    Friend(int i) { id = i; }
}

public class SocialMedia {
    static Friend head;

    static void addFriend(int id) {
        Friend f = new Friend(id);
        f.next = head;
        head = f;
    }

    static int count() {
        int c = 0;
        for (Friend t = head; t != null; t = t.next) c++;
        return c;
    }

    public static void main(String[] args) {
        addFriend(1);
        addFriend(2);
        System.out.println(count());
    }
}
