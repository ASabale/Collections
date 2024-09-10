package implementation.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of books
        Vector<String> bookVector = new Vector<>();

        // Adding books to the Vector
        bookVector.add("The Catcher in the Rye");
        bookVector.add("To Kill a Mockingbird");
        bookVector.add("1984");
        bookVector.add("Pride and Prejudice");
        System.out.println("Book Vector after adding: " + bookVector);

        // Adding a book at a specific position
        bookVector.add(2, "Brave New World");
        System.out.println("Book Vector after adding at index 2: " + bookVector);

        // Retrieving a book by index
        System.out.println("Book at index 1: " + bookVector.get(1));

        // Removing a book by index and by object
        bookVector.remove(3); // Removes "Pride and Prejudice"
        bookVector.remove("1984"); // Removes "1984"
        System.out.println("Book Vector after removals: " + bookVector);

        // Checking if the Vector contains a specific book
        System.out.println("Contains 'The Catcher in the Rye'? " + bookVector.contains("The Catcher in the Rye"));
        System.out.println("Contains '1984'? " + bookVector.contains("1984"));

        // Updating a book at a specific position
        bookVector.set(1, "Moby Dick");
        System.out.println("Book Vector after updating index 1: " + bookVector);

        // Getting the size of the Vector
        System.out.println("Size of the vector: " + bookVector.size());

        // Iterating over the Vector
        System.out.println("Iterating over the book vector:");
        for (String book : bookVector) {
            System.out.println("Book: " + book);
        }

        // Checking if the Vector is empty
        System.out.println("Is the book vector empty? " + bookVector.isEmpty());

        // Clearing the Vector
        bookVector.clear();
        System.out.println("Book Vector after clearing: " + bookVector);
    }
}

