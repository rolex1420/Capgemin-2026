import java.util.Stack;

class SortStackRecursion {
    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sort(stack);
            insert(stack, x);
        }
    }

    static void insert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }
        int temp = stack.pop();
        insert(stack, x);
        stack.push(temp);
    }
}
