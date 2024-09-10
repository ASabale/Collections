package Interface.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Creating a List of books
        List<String> readingList = new ArrayList<>();
        readingList.add("To Kill a Mockingbird");
        readingList.add("1984");
        readingList.add("The Great Gatsby");
        readingList.add("Pride and Prejudice");
        System.out.println("Initial reading list: " + readingList);

        // Creating a ListIterator for the List
        ListIterator<String> listIterator = readingList.listIterator();

        // Iterating forward through the List using the ListIterator
        System.out.println("Iterating forward through the reading list:");
        while (listIterator.hasNext()) {
            String book = listIterator.next();
            System.out.println("Book: " + book);
        }

        // Adding an element at the current position (add)
        listIterator = readingList.listIterator(); // Recreate ListIterator to start from the beginning
        listIterator.next(); // Move to the first element
        listIterator.add("Moby Dick");
        System.out.println("Reading list after adding 'Moby Dick': " + readingList);

        // Iterating backward through the List using the ListIterator
        System.out.println("Iterating backward through the reading list:");
        while (listIterator.hasPrevious()) {
            String book = listIterator.previous();
            System.out.println("Book: " + book);
        }

        // Setting an element at the current position (set)
        listIterator = readingList.listIterator(); // Recreate ListIterator to start from the beginning
        listIterator.next(); // Move to the first element
        listIterator.set("Brave New World");
        System.out.println("Reading list after setting 'Brave New World' at the first position: " + readingList);

        // Removing an element from the List using ListIterator (remove)
        listIterator = readingList.listIterator(); // Recreate ListIterator to start from the beginning
        listIterator.next(); // Move to the first element
        listIterator.remove(); // Remove the first element
        System.out.println("Reading list after removing the first book: " + readingList);

        // Checking the current index (nextIndex, previousIndex)
        listIterator = readingList.listIterator(); // Recreate ListIterator to start from the beginning
        listIterator.next(); // Move to the first element
        System.out.println("Current index: " + listIterator.nextIndex()); // Index after the first element
        listIterator.previous(); // Move back to the starting position
        System.out.println("Previous index: " + listIterator.previousIndex()); // Index before the first element
    }
}
