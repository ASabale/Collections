package Queues;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(5);
        System.out.println(pq);
        pq.add(6);
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        pq.offer(1);
        System.out.println(pq);
        pq.offer(2);
        System.out.println(pq);

        System.out.println(pq.element());
        System.out.println(pq);
    }
}
