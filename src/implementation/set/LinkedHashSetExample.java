package implementation.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of cities
        LinkedHashSet<String> citiesSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        citiesSet.add("New York");
        citiesSet.add("Los Angeles");
        citiesSet.add("Chicago");
        citiesSet.add("Houston");
        System.out.println("LinkedHashSet after adding cities: " + citiesSet);

        // Adding a duplicate element
        citiesSet.add("New York");
        System.out.println("LinkedHashSet after adding duplicate 'New York': " + citiesSet);

        // Removing an element
        citiesSet.remove("Chicago");
        System.out.println("LinkedHashSet after removing 'Chicago': " + citiesSet);

        // Checking if the LinkedHashSet contains a specific element
        System.out.println("Contains 'Los Angeles'? " + citiesSet.contains("Los Angeles"));
        System.out.println("Contains 'Chicago'? " + citiesSet.contains("Chicago"));

        // Checking the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + citiesSet.size());

        // Iterating over the LinkedHashSet
        System.out.println("Iterating over the LinkedHashSet:");
        for (String city : citiesSet) {
            System.out.println("City: " + city);
        }

        // Clearing the LinkedHashSet
        citiesSet.clear();
        System.out.println("LinkedHashSet after clearing: " + citiesSet);

        // Checking if the LinkedHashSet is empty
        System.out.println("Is the LinkedHashSet empty? " + citiesSet.isEmpty());
    }
}

