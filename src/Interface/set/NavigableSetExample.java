package Interface.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        // Creating a NavigableSet of employee IDs
        NavigableSet<Integer> employeeIDs = new TreeSet<>();

        // Adding employee IDs (add)
        employeeIDs.add(1001);
        employeeIDs.add(1005);
        employeeIDs.add(1003);
        employeeIDs.add(1002);
        employeeIDs.add(1004);
        System.out.println("Initial set of employee IDs (sorted): " + employeeIDs);

        // Getting the greatest ID less than a given value (lower)
        System.out.println("Greatest ID less than 1004: " + employeeIDs.lower(1004));

        // Getting the least ID greater than a given value (higher)
        System.out.println("Least ID greater than 1004: " + employeeIDs.higher(1004));

        // Getting the greatest ID less than or equal to a given value (floor)
        System.out.println("Greatest ID less than or equal to 1004: " + employeeIDs.floor(1004));

        // Getting the least ID greater than or equal to a given value (ceiling)
        System.out.println("Least ID greater than or equal to 1004: " + employeeIDs.ceiling(1004));

        // Polling (removing) the first (lowest) and last (highest) elements (pollFirst, pollLast)
        System.out.println("Polling (removing) first element: " + employeeIDs.pollFirst());
        System.out.println("Polling (removing) last element: " + employeeIDs.pollLast());
        System.out.println("Set after polling first and last elements: " + employeeIDs);

        // Getting a descending set (descendingSet)
        NavigableSet<Integer> descendingEmployeeIDs = employeeIDs.descendingSet();
        System.out.println("Employee IDs in descending order: " + descendingEmployeeIDs);

        // Getting a subset of IDs (subSet)
        NavigableSet<Integer> subsetIDs = employeeIDs.subSet(1002, true, 1005, false);
        System.out.println("Subset of IDs from 1002 (inclusive) to 1005 (exclusive): " + subsetIDs);

        // Iterating over the set (for-each loop)
        System.out.println("Iterating over the set of employee IDs:");
        for (Integer id : employeeIDs) {
            System.out.println(id);
        }

        // Clearing the set (clear)
        employeeIDs.clear();
        System.out.println("Set after clearing all IDs: " + employeeIDs);

        // Checking if the set is empty (isEmpty)
        System.out.println("Is the set empty? " + employeeIDs.isEmpty());
    }
}

