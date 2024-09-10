package Interface.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue of customers
        Queue<String> customerQueue = new LinkedList<>();

        // Adding customers to the queue (offer)
        customerQueue.offer("Customer 1");
        customerQueue.offer("Customer 2");
        customerQueue.offer("Customer 3");
        System.out.println("Initial queue: " + customerQueue);

        // Viewing the customer at the front of the queue without removing (peek)
        System.out.println("Customer at the front (peek): " + customerQueue.peek());

        // Serving (removing) the first customer (poll)
        System.out.println("Serving (removing) the first customer: " + customerQueue.poll());
        System.out.println("Queue after serving the first customer: " + customerQueue);

        // Adding more customers (offer)
        customerQueue.offer("Customer 4");
        customerQueue.offer("Customer 5");
        System.out.println("Queue after adding more customers: " + customerQueue);

        // Viewing and serving the next customer (element, remove)
        System.out.println("Next customer to be served (element): " + customerQueue.element());
        System.out.println("Serving next customer (remove): " + customerQueue.remove());
        System.out.println("Queue after serving next customer: " + customerQueue);

        // Checking if the queue contains a specific customer (contains)
        System.out.println("Contains 'Customer 4'? " + customerQueue.contains("Customer 4"));

        // Checking the size of the queue (size)
        System.out.println("Number of customers in queue: " + customerQueue.size());

        // Clearing the queue (clear)
        customerQueue.clear();
        System.out.println("Queue after clearing: " + customerQueue);

        // Checking if the queue is empty (isEmpty)
        System.out.println("Is the queue empty? " + customerQueue.isEmpty());
    }
}
