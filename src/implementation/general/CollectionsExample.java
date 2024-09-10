package implementation.general;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Date"));
        System.out.println("Original List: " + list);

        // Sorting the List
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Shuffling the List
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Reversing the List
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Finding the max and min elements
        String max = Collections.max(list);
        String min = Collections.min(list);
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

        // Filling the List with a specific value
        Collections.fill(list, "Fruit");
        System.out.println("List after filling with 'Fruit': " + list);

        // Creating a synchronized List
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>(list));
        System.out.println("Synchronized List: " + synchronizedList);

        // Creating an unmodifiable List
        List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("Orange", "Grape")));
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Copying elements from one List to another
        List<String> sourceList = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        List<String> destList = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(destList, sourceList);
        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List after copy: " + destList);

        // Frequency of an element in a Collection
        int frequency = Collections.frequency(sourceList, "Cat");
        System.out.println("Frequency of 'Cat': " + frequency);

        // Creating a Map
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Doe", 22);
        System.out.println("Original Map: " + map);

        // Sorting the Map by keys
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted Map: " + sortedMap);

        // Converting Map to a List of entries and sorting by value
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        System.out.println("Map entries sorted by value: " + entryList);
    }
}

