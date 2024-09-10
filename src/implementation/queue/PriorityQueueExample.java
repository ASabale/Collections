package implementation.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of tasks with natural ordering (based on string natural order)
        PriorityQueue<String> taskQueue = new PriorityQueue<>();

        // Adding tasks to the PriorityQueue
        taskQueue.add("Complete project report");
        taskQueue.add("Prepare for meeting");
        taskQueue.add("Buy groceries");
        taskQueue.add("Respond to emails");
        System.out.println("PriorityQueue after adding tasks: " + taskQueue);

        // Peeking at the highest-priority task (lowest natural order)
        System.out.println("Highest-priority task (peek): " + taskQueue.peek());

        // Removing the highest-priority task
        System.out.println("Removed task: " + taskQueue.poll());
        System.out.println("PriorityQueue after removing the highest-priority task: " + taskQueue);

        // Adding tasks with different priorities (using custom ordering)
        PriorityQueue<Task> customPriorityQueue = new PriorityQueue<>((t1, t2) -> Integer.compare(t1.priority, t2.priority));

        // Creating and adding tasks with different priorities
        customPriorityQueue.add(new Task("Complete project report", 3));
        customPriorityQueue.add(new Task("Prepare for meeting", 1));
        customPriorityQueue.add(new Task("Buy groceries", 4));
        customPriorityQueue.add(new Task("Respond to emails", 2));
        System.out.println("Custom PriorityQueue after adding tasks: " + customPriorityQueue);

        // Peeking at the highest-priority task
        System.out.println("Highest-priority task (peek): " + customPriorityQueue.peek());

        // Removing the highest-priority task
        System.out.println("Removed task: " + customPriorityQueue.poll());
        System.out.println("Custom PriorityQueue after removing the highest-priority task: " + customPriorityQueue);
    }

    // Inner class for tasks with priority
    static class Task {
        String description;
        int priority;

        Task(String description, int priority) {
            this.description = description;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return description + " (Priority: " + priority + ")";
        }
    }
}

