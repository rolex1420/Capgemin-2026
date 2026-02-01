import java.util.*;

public class ReverseQueue {
    static <T> void reverse(Queue<T> q) {
        Stack<T> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.remove());
        while (!stack.isEmpty()) q.add(stack.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(10, 20, 30));
        reverse(q);
        System.out.println(q);
    }
}
