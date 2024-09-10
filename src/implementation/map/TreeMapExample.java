package implementation.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap with student names as keys and grades as values
        TreeMap<String, Integer> studentMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        studentMap.put("Alice", 90);
        studentMap.put("Bob", 85);
        studentMap.put("Charlie", 92);
        studentMap.put("Diana", 88);
        System.out.println("TreeMap after adding students: " + studentMap);

        // Getting the value for a specific key
        System.out.println("Grade of Bob: " + studentMap.get("Bob"));

        // Checking if the map contains a specific key or value
        System.out.println("Contains key 'Charlie'? " + studentMap.containsKey("Charlie"));
        System.out.println("Contains value 92? " + studentMap.containsValue(92));

        // Removing a key-value pair
        studentMap.remove("Diana");
        System.out.println("TreeMap after removing Diana: " + studentMap);

        // Getting the first and last keys
        System.out.println("First key: " + studentMap.firstKey());
        System.out.println("Last key: " + studentMap.lastKey());

        // Getting a subset of the map
        System.out.println("HeadMap (<= 'Charlie'): " + studentMap.headMap("Charlie"));
        System.out.println("TailMap (>= 'Charlie'): " + studentMap.tailMap("Charlie"));
        System.out.println("SubMap ('Bob' <= x < 'Diana'): " + studentMap.subMap("Bob", "Diana"));

        // Iterating over the TreeMap
        System.out.println("Iterating over the TreeMap:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Checking the size of the TreeMap
        System.out.println("Size of the TreeMap: " + studentMap.size());

        // Clearing the TreeMap
        studentMap.clear();
        System.out.println("TreeMap after clearing: " + studentMap);

        // Checking if the TreeMap is empty
        System.out.println("Is the TreeMap empty? " + studentMap.isEmpty());
    }
}
