package Interface.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // Creating a SortedMap of employee names to IDs
        SortedMap<String, Integer> employeeMap = new TreeMap<>();

        // Adding employees (put)
        employeeMap.put("Alice", 1001);
        employeeMap.put("Bob", 1002);
        employeeMap.put("Charlie", 1003);
        employeeMap.put("Diana", 1004);
        System.out.println("Employee Map after adding entries: " + employeeMap);

        // Getting the first and last employee (firstKey, lastKey)
        System.out.println("First employee (firstKey): " + employeeMap.firstKey());
        System.out.println("Last employee (lastKey): " + employeeMap.lastKey());

        // Getting a submap from a range of keys (headMap, tailMap, subMap)
        SortedMap<String, Integer> headMap = employeeMap.headMap("Charlie");
        System.out.println("Employees before 'Charlie' (headMap): " + headMap);

        SortedMap<String, Integer> tailMap = employeeMap.tailMap("Charlie");
        System.out.println("Employees from 'Charlie' onwards (tailMap): " + tailMap);

        SortedMap<String, Integer> subMap = employeeMap.subMap("Bob", "Diana");
        System.out.println("Employees between 'Bob' and 'Diana' (subMap): " + subMap);

        // Getting a key-value pair for a specific key (get)
        System.out.println("ID of 'Bob': " + employeeMap.get("Bob"));

        // Checking if a specific key or value exists (containsKey, containsValue)
        System.out.println("Contains key 'Alice'? " + employeeMap.containsKey("Alice"));
        System.out.println("Contains value 1003? " + employeeMap.containsValue(1003));

        // Removing a specific entry (remove)
        employeeMap.remove("Diana");
        System.out.println("Employee Map after removing 'Diana': " + employeeMap);

        // Iterating over the entries (for-each loop)
        System.out.println("Iterating over the sorted map:");
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", ID: " + entry.getValue());
        }

        // Checking the size of the map (size)
        System.out.println("Number of employees: " + employeeMap.size());

        // Clearing the map (clear)
        employeeMap.clear();
        System.out.println("Employee Map after clearing: " + employeeMap);

        // Checking if the map is empty (isEmpty)
        System.out.println("Is the map empty? " + employeeMap.isEmpty());
    }
}
