package Interface.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque of tasks
        Deque<String> taskDeque = new ArrayDeque<>();

        // Adding tasks to the front and back (addFirst, addLast)
        taskDeque.addFirst("Task 1 - Urgent");
        taskDeque.addLast("Task 2 - Regular");
        taskDeque.addLast("Task 3 - Regular");
        taskDeque.addFirst("Task 4 - Most Urgent");
        System.out.println("Deque after adding tasks: " + taskDeque);

        // Viewing the first and last tasks without removing (getFirst, getLast)
        System.out.println("First task (getFirst): " + taskDeque.getFirst());
        System.out.println("Last task (getLast): " + taskDeque.getLast());

        // Removing the first and last tasks (removeFirst, removeLast)
        System.out.println("Removing first task: " + taskDeque.removeFirst());
        System.out.println("Deque after removing first task: " + taskDeque);
        System.out.println("Removing last task: " + taskDeque.removeLast());
        System.out.println("Deque after removing last task: " + taskDeque);

        // Offering tasks to the front and back (offerFirst, offerLast)
        taskDeque.offerFirst("Task 5 - Urgent");
        taskDeque.offerLast("Task 6 - Regular");
        System.out.println("Deque after offering tasks: " + taskDeque);

        // Polling (removing) tasks from the front and back (pollFirst, pollLast)
        System.out.println("Polling (removing) first task: " + taskDeque.pollFirst());
        System.out.println("Deque after polling first task: " + taskDeque);
        System.out.println("Polling (removing) last task: " + taskDeque.pollLast());
        System.out.println("Deque after polling last task: " + taskDeque);

        // Peeking at the first and last tasks without removing (peekFirst, peekLast)
        System.out.println("First task (peekFirst): " + taskDeque.peekFirst());
        System.out.println("Last task (peekLast): " + taskDeque.peekLast());

        // Checking if the deque contains a specific task (contains)
        System.out.println("Contains 'Task 3 - Regular'? " + taskDeque.contains("Task 3 - Regular"));

        // Checking the size of the deque (size)
        System.out.println("Number of tasks in the deque: " + taskDeque.size());

        // Clearing the deque (clear)
        taskDeque.clear();
        System.out.println("Deque after clearing: " + taskDeque);

        // Checking if the deque is empty (isEmpty)
        System.out.println("Is the deque empty? " + taskDeque.isEmpty());
    }
}
