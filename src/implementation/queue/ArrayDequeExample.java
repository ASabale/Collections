package implementation.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque of tasks
        ArrayDeque<String> taskDeque = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        taskDeque.add("Complete project report");
        taskDeque.add("Prepare for meeting");
        taskDeque.add("Buy groceries");
        taskDeque.add("Respond to emails");
        System.out.println("ArrayDeque after adding tasks: " + taskDeque);

        // Adding elements at the beginning and end
        taskDeque.addFirst("Check email");
        taskDeque.addLast("Finish presentation");
        System.out.println("ArrayDeque after adding at the beginning and end: " + taskDeque);

        // Removing elements from the beginning and end
        System.out.println("Removed from beginning: " + taskDeque.removeFirst());
        System.out.println("Removed from end: " + taskDeque.removeLast());
        System.out.println("ArrayDeque after removals: " + taskDeque);

        // Peeking at the first and last elements
        System.out.println("First task (peekFirst): " + taskDeque.peekFirst());
        System.out.println("Last task (peekLast): " + taskDeque.peekLast());

        // Checking if the ArrayDeque contains a specific element
        System.out.println("Contains 'Buy groceries'? " + taskDeque.contains("Buy groceries"));
        System.out.println("Contains 'Finish presentation'? " + taskDeque.contains("Finish presentation"));

        // Iterating over the ArrayDeque
        System.out.println("Iterating over the ArrayDeque:");
        for (String task : taskDeque) {
            System.out.println("Task: " + task);
        }

        // Clearing the ArrayDeque
        taskDeque.clear();
        System.out.println("ArrayDeque after clearing: " + taskDeque);

        // Checking if the ArrayDeque is empty
        System.out.println("Is the ArrayDeque empty? " + taskDeque.isEmpty());
    }
}

