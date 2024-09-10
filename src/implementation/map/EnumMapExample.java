package implementation.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    // Define an enum for days of the week
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Creating an EnumMap with Day as the key and Integer as the value
        EnumMap<Day, Integer> tasksMap = new EnumMap<>(Day.class);

        // Adding key-value pairs to the EnumMap
        tasksMap.put(Day.MONDAY, 5);
        tasksMap.put(Day.TUESDAY, 3);
        tasksMap.put(Day.WEDNESDAY, 7);
        tasksMap.put(Day.THURSDAY, 2);
        tasksMap.put(Day.FRIDAY, 6);
        System.out.println("EnumMap after adding tasks: " + tasksMap);

        // Getting the value for a specific key
        System.out.println("Tasks on Wednesday: " + tasksMap.get(Day.WEDNESDAY));

        // Checking if the map contains a specific key or value
        System.out.println("Contains key MONDAY? " + tasksMap.containsKey(Day.MONDAY));
        System.out.println("Contains value 7? " + tasksMap.containsValue(7));

        // Removing a key-value pair
        tasksMap.remove(Day.THURSDAY);
        System.out.println("EnumMap after removing Thursday: " + tasksMap);

        // Iterating over the EnumMap
        System.out.println("Iterating over the EnumMap:");
        for (Map.Entry<Day, Integer> entry : tasksMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking the size of the EnumMap
        System.out.println("Size of the EnumMap: " + tasksMap.size());

        // Clearing the EnumMap
        tasksMap.clear();
        System.out.println("EnumMap after clearing: " + tasksMap);

        // Checking if the EnumMap is empty
        System.out.println("Is the EnumMap empty? " + tasksMap.isEmpty());
    }
}
