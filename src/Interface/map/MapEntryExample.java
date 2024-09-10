package Interface.map;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        // Creating a Map of products and their prices
        Map<String, Double> productMap = new HashMap<>();
        productMap.put("Laptop", 1200.00);
        productMap.put("Smartphone", 800.00);
        productMap.put("Tablet", 300.00);
        productMap.put("Headphones", 150.00);
        System.out.println("Product Map: " + productMap);

        // Iterating over the entries in the Map using Map.Entry
        System.out.println("Iterating over Map.Entry:");
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            String product = entry.getKey();
            Double price = entry.getValue();
            System.out.println("Product: " + product + ", Price: " + price);
        }

        // Accessing and modifying an entry
        System.out.println("Modifying 'Tablet' price:");
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            if (entry.getKey().equals("Tablet")) {
                // Access and print current price
                System.out.println("Current price of Tablet: " + entry.getValue());

                // Modify the price
                entry.setValue(350.00);
                System.out.println("Updated price of Tablet: " + entry.getValue());
            }
        }

        // Removing an entry
        System.out.println("Removing 'Headphones':");
        productMap.entrySet().removeIf(entry -> entry.getKey().equals("Headphones"));
        System.out.println("Product Map after removing 'Headphones': " + productMap);

        // Creating and using a Map.Entry directly (not a common use case, but for demonstration)
        Map.Entry<String, Double> sampleEntry = new HashMap.SimpleEntry<>("Keyboard", 50.00);
        System.out.println("Sample Entry: " + sampleEntry.getKey() + " - " + sampleEntry.getValue());

        // Modifying the sample entry
        sampleEntry.setValue(45.00);
        System.out.println("Modified Sample Entry: " + sampleEntry.getKey() + " - " + sampleEntry.getValue());
    }
}
