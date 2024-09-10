package implementation.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with employee names as keys and IDs as values
        HashMap<String, Integer> employeeMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        employeeMap.put("Alice", 101);
        employeeMap.put("Bob", 102);
        employeeMap.put("Charlie", 103);
        employeeMap.put("Diana", 104);
        System.out.println("HashMap after adding employees: " + employeeMap);

        // Getting the value for a specific key
        System.out.println("ID of Bob: " + employeeMap.get("Bob"));

        // Checking if the map contains a specific key or value
        System.out.println("Contains key 'Charlie'? " + employeeMap.containsKey("Charlie"));
        System.out.println("Contains value 103? " + employeeMap.containsValue(103));

        // Removing a key-value pair
        employeeMap.remove("Diana");
        System.out.println("HashMap after removing Diana: " + employeeMap);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", ID: " + entry.getValue());
        }

        // Checking the size of the HashMap
        System.out.println("Size of the HashMap: " + employeeMap.size());

        // Clearing the HashMap
        employeeMap.clear();
        System.out.println("HashMap after clearing: " + employeeMap);

        // Checking if the HashMap is empty
        System.out.println("Is the HashMap empty? " + employeeMap.isEmpty());
    }
}
