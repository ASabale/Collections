package implementation.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with contact names as keys and phone numbers as values
        LinkedHashMap<String, String> contactMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        contactMap.put("John", "555-1234");
        contactMap.put("Jane", "555-5678");
        contactMap.put("Emily", "555-8765");
        contactMap.put("Michael", "555-4321");
        System.out.println("LinkedHashMap after adding contacts: " + contactMap);

        // Getting the value for a specific key
        System.out.println("Phone number of Jane: " + contactMap.get("Jane"));

        // Checking if the map contains a specific key or value
        System.out.println("Contains key 'Emily'? " + contactMap.containsKey("Emily"));
        System.out.println("Contains value '555-8765'? " + contactMap.containsValue("555-8765"));

        // Removing a key-value pair
        contactMap.remove("Michael");
        System.out.println("LinkedHashMap after removing Michael: " + contactMap);

        // Iterating over the LinkedHashMap
        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, String> entry : contactMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }

        // Checking the size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + contactMap.size());

        // Clearing the LinkedHashMap
        contactMap.clear();
        System.out.println("LinkedHashMap after clearing: " + contactMap);

        // Checking if the LinkedHashMap is empty
        System.out.println("Is the LinkedHashMap empty? " + contactMap.isEmpty());
    }
}
