package Lists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(0);
        list.addLast(4);

        list.descendingIterator().forEachRemaining(System.out::print);
        System.out.println();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.listIterator(3).next();


        list.offerFirst(0);
        list.offerLast(5);
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        list.remove();
        list.removeFirst();
        list.removeLast();
        list.removeFirstOccurrence(1);
        list.removeLastOccurrence(2);
        list.removeAll(Arrays.asList(5,6));

        System.out.println(list);



    }
}
