package Interface.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        // Creating a NavigableMap of product names to prices
        NavigableMap<String, Double> productMap = new TreeMap<>();

        // Adding products (put)
        productMap.put("Laptop", 1200.00);
        productMap.put("Smartphone", 800.00);
        productMap.put("Tablet", 300.00);
        productMap.put("Headphones", 150.00);
        productMap.put("Keyboard", 50.00);
        System.out.println("Product Map after adding entries: " + productMap);

        // Getting the first and last product (firstEntry, lastEntry)
        System.out.println("First product (firstEntry): " + productMap.firstEntry());
        System.out.println("Last product (lastEntry): " + productMap.lastEntry());

        // Getting the greatest key less than a given key (lowerEntry)
        System.out.println("Product with the highest price less than 'Smartwatch': " + productMap.lowerEntry("Smartwatch"));

        // Getting the least key greater than a given key (higherEntry)
        System.out.println("Product with the lowest price greater than 'Laptop': " + productMap.higherEntry("Laptop"));

        // Getting the greatest key less than or equal to a given key (floorEntry)
        System.out.println("Product with the highest price less than or equal to 'Smartphone': " + productMap.floorEntry("Smartphone"));

        // Getting the least key greater than or equal to a given key (ceilingEntry)
        System.out.println("Product with the lowest price greater than or equal to 'Headphones': " + productMap.ceilingEntry("Headphones"));

        // Removing and retrieving the first and last entries (pollFirstEntry, pollLastEntry)
        System.out.println("Polling (removing) first product: " + productMap.pollFirstEntry());
        System.out.println("Product Map after polling first product: " + productMap);
        System.out.println("Polling (removing) last product: " + productMap.pollLastEntry());
        System.out.println("Product Map after polling last product: " + productMap);

        // Getting a descending map (descendingMap)
        NavigableMap<String, Double> descendingProductMap = productMap.descendingMap();
        System.out.println("Product Map in descending order: " + descendingProductMap);

        // Getting a submap (subMap)
        NavigableMap<String, Double> subMap = productMap.subMap("Headphones", true, "Tablet", true);
        System.out.println("Products between 'Headphones' and 'Tablet' (inclusive): " + subMap);

        // Iterating over the entries (for-each loop)
        System.out.println("Iterating over the navigable map:");
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        // Checking the size of the map (size)
        System.out.println("Number of products: " + productMap.size());

        // Clearing the map (clear)
        productMap.clear();
        System.out.println("Product Map after clearing: " + productMap);

        // Checking if the map is empty (isEmpty)
        System.out.println("Is the map empty? " + productMap.isEmpty());
    }
}

