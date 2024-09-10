package implementation.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of hobbies
        HashSet<String> hobbiesSet = new HashSet<>();

        // Adding elements to the HashSet
        hobbiesSet.add("Reading");
        hobbiesSet.add("Cycling");
        hobbiesSet.add("Cooking");
        hobbiesSet.add("Gardening");
        System.out.println("HashSet after adding hobbies: " + hobbiesSet);

        // Adding a duplicate element
        hobbiesSet.add("Reading");
        System.out.println("HashSet after adding duplicate 'Reading': " + hobbiesSet);

        // Removing an element
        hobbiesSet.remove("Cooking");
        System.out.println("HashSet after removing 'Cooking': " + hobbiesSet);

        // Checking if the HashSet contains a specific element
        System.out.println("Contains 'Cycling'? " + hobbiesSet.contains("Cycling"));
        System.out.println("Contains 'Cooking'? " + hobbiesSet.contains("Cooking"));

        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + hobbiesSet.size());

        // Iterating over the HashSet
        System.out.println("Iterating over the HashSet:");
        for (String hobby : hobbiesSet) {
            System.out.println("Hobby: " + hobby);
        }

        // Clearing the HashSet
        hobbiesSet.clear();
        System.out.println("HashSet after clearing: " + hobbiesSet);

        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hobbiesSet.isEmpty());
    }
}

