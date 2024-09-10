package implementation.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of numbers
        TreeSet<Integer> numbersSet = new TreeSet<>();

        // Adding elements to the TreeSet
        numbersSet.add(10);
        numbersSet.add(5);
        numbersSet.add(20);
        numbersSet.add(15);
        System.out.println("TreeSet after adding numbers: " + numbersSet);

        // Adding a duplicate element
        numbersSet.add(10);
        System.out.println("TreeSet after adding duplicate 10: " + numbersSet);

        // Removing an element
        numbersSet.remove(15);
        System.out.println("TreeSet after removing 15: " + numbersSet);

        // Checking if the TreeSet contains a specific element
        System.out.println("Contains 5? " + numbersSet.contains(5));
        System.out.println("Contains 15? " + numbersSet.contains(15));

        // Getting the first and last elements
        System.out.println("First element: " + numbersSet.first());
        System.out.println("Last element: " + numbersSet.last());

        // Getting a subset (headSet, tailSet, subSet)
        System.out.println("HeadSet (<= 10): " + numbersSet.headSet(10));
        System.out.println("TailSet (>= 10): " + numbersSet.tailSet(10));
        System.out.println("SubSet (5 <= x < 20): " + numbersSet.subSet(5, 20));

        // Iterating over the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (Integer number : numbersSet) {
            System.out.println("Number: " + number);
        }

        // Clearing the TreeSet
        numbersSet.clear();
        System.out.println("TreeSet after clearing: " + numbersSet);

        // Checking if the TreeSet is empty
        System.out.println("Is the TreeSet empty? " + numbersSet.isEmpty());
    }
}

