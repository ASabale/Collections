package Lists;

import java.util.Queue;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.empty());

        System.out.println(stack.search(1));

        System.out.println(stack);
    }
}
